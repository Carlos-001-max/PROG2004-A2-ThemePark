import java.util.*;
import java.io.*;

/**
 * Ride class representing theme park rides
 * Implements RideInterface
 */
public class Ride implements RideInterface {
    private final String rideName;
    private final Employee operator;
    private final int maxRider;
    private int numOfCycles;
    private final Queue<Visitor> waitingLine;
    private final LinkedList<Visitor> rideHistory;

    /**
     * Constructor for Ride class
     */
    public Ride(String rideName, String rideType, Employee operator, int maxRider) {
        if (rideName == null || rideName.trim().isEmpty()) {
            throw new ThemeParkException("Ride name cannot be null or empty");
        }
        if (maxRider < 1) {
            throw new ThemeParkException("Max rider must be at least 1");
        }
        this.rideName = rideName;
        this.operator = operator;
        this.maxRider = maxRider;
        this.numOfCycles = 0;
        this.waitingLine = new LinkedList<>();
        this.rideHistory = new LinkedList<>();

        // Use rideType parameter to avoid "never accessed" warning
        validateRideType(rideType);
    }

    /**
     * Validate ride type
     */
    private void validateRideType(String rideType) {
        String[] validTypes = {"Thrill Ride", "Water Ride", "Family Ride", "Kids Ride", "General"};
        if (rideType == null || !java.util.Arrays.asList(validTypes).contains(rideType)) {
            throw new ThemeParkException("Invalid ride type");
        }
    }

    /**
     * Add visitor to waiting queue
     */
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        if (visitor == null) {
            throw new ThemeParkException("Cannot add null visitor to queue");
        }
        waitingLine.add(visitor);
        System.out.println("Added " + visitor.getName() + " to queue for " + rideName);
    }

    /**
     * Remove visitor from waiting queue
     */
    @Override
    public void removeVisitorFromQueue() {
        Visitor removed = waitingLine.poll();
        if (removed != null) {
            System.out.println("Removed " + removed.getName() + " from queue");
        } else {
            System.out.println("Queue is empty");
        }
    }

    /**
     * Print all visitors in waiting queue
     */
    @Override
    public void printQueue() {
        System.out.println("Queue for " + rideName + ":");
        if (waitingLine.isEmpty()) {
            System.out.println("Empty");
            return;
        }

        int position = 1;
        for (Visitor visitor : waitingLine) {
            System.out.println(position + ". " + visitor.getName());
            position++;
        }
    }

    /**
     * Add visitor to ride history
     */
    @Override
    public void addVisitorToHistory(Visitor visitor) {
        if (visitor == null) {
            throw new ThemeParkException("Cannot add null visitor to history");
        }
        rideHistory.add(visitor);
        System.out.println("Added " + visitor.getName() + " to ride history");
    }

    /**
     * Check if visitor is in ride history
     */
    @Override
    public void checkVisitorFromHistory(Visitor visitor) {
        if (visitor == null) {
            throw new ThemeParkException("Cannot check null visitor");
        }
        boolean found = rideHistory.contains(visitor);
        System.out.println("Visitor " + visitor.getName() + " in history: " + found);
    }

    /**
     * Get number of visitors in ride history
     */
    @Override
    public int numberOfVisitors() {
        return rideHistory.size();
    }

    /**
     * Print all visitors in ride history
     */
    @Override
    public void printRideHistory() {
        System.out.println("Ride history for " + rideName + ":");
        if (rideHistory.isEmpty()) {
            System.out.println("Empty");
            return;
        }

        Iterator<Visitor> iterator = rideHistory.iterator();
        int count = 1;
        while (iterator.hasNext()) {
            System.out.println(count + ". " + iterator.next());
            count++;
        }
    }

    /**
     * Run one ride cycle
     */
    @Override
    public void runOneCycle() {
        if (operator == null) {
            throw new ThemeParkException("Cannot run ride - no operator assigned");
        }

        if (waitingLine.isEmpty()) {
            throw new ThemeParkException("Cannot run ride - no visitors in queue");
        }

        int ridersThisCycle = Math.min(maxRider, waitingLine.size());
        System.out.println("Running " + rideName + " with " + ridersThisCycle + " visitors");

        for (int i = 0; i < ridersThisCycle; i++) {
            Visitor rider = waitingLine.poll();
            if (rider != null) {
                rideHistory.add(rider);
                System.out.println(rider.getName() + " took the ride");
            }
        }

        numOfCycles++;
        System.out.println("Total cycles run: " + numOfCycles);
    }

    /**
     * Sort ride history using comparator
     */
    public void sortRideHistory(Comparator<Visitor> comparator) {
        rideHistory.sort(comparator);
        System.out.println("Ride history sorted");
    }

    /**
     * Export ride history to file
     */
    public void exportRideHistory(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (Visitor visitor : rideHistory) {
                writer.println(visitor.getName() + "," + visitor.getAge() + "," +
                        visitor.getEmail() + "," + visitor.getVisitorId() + "," +
                        visitor.getTicketType());
            }
            System.out.println("Exported ride history to " + filename);
        } catch (IOException e) {
            throw new ThemeParkException("Failed to export ride history: " + e.getMessage());
        }
    }

    /**
     * Import ride history from file
     */
    public void importRideHistory(String filename) {
        int importedCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    String name = parts[0];
                    int age = Integer.parseInt(parts[1]);
                    String email = parts[2];
                    String visitorId = parts[3];
                    String ticketType = parts[4];

                    Visitor visitor = new Visitor(name, age, email, visitorId, ticketType);
                    rideHistory.add(visitor);
                    importedCount++;
                }
            }
            System.out.println("Imported " + importedCount + " visitors from " + filename);
        } catch (IOException e) {
            throw new ThemeParkException("Failed to import ride history: " + e.getMessage());
        }
    }
}