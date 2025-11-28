/**
 * Main class for Theme Park Management System
 * Demonstrates all assignment requirements
 */
public class AssignmentTwo {

    /**
     * Main method - program entry point
     */
    @SuppressWarnings("unused")
    static void main(String[] args) {
        System.out.println("=== Theme Park Management System ===");

        AssignmentTwo assignment = new AssignmentTwo();

        // Run all required parts
        assignment.partThree();
        assignment.partFourA();
        assignment.partFourB();
        assignment.partFive();
        assignment.partSix();
        assignment.partSeven();

        // Demonstrate exception handling
        assignment.demoExceptionHandling();

        System.out.println("=== All demonstrations completed ===");
    }

    /**
     * Part 3: Queue demonstration
     */
    public void partThree() {
        System.out.println("\n--- Part 3: Queue Management ---");

        Employee operator = new Employee("John Operator", 30, "john@park.com", "E001", "Operations");
        Ride rollerCoaster = new Ride("Roller Coaster", "Thrill Ride", operator, 2);

        // Create visitors
        Visitor visitor1 = new Visitor("Alice", 25, "alice@email.com", "V001", "VIP");
        Visitor visitor2 = new Visitor("Bob", 30, "bob@email.com", "V002", "General");
        Visitor visitor3 = new Visitor("Charlie", 22, "charlie@email.com", "V003", "Student");
        Visitor visitor4 = new Visitor("Diana", 28, "diana@email.com", "V004", "VIP");
        Visitor visitor5 = new Visitor("Eve", 35, "eve@email.com", "V005", "General");

        // Add to queue
        rollerCoaster.addVisitorToQueue(visitor1);
        rollerCoaster.addVisitorToQueue(visitor2);
        rollerCoaster.addVisitorToQueue(visitor3);
        rollerCoaster.addVisitorToQueue(visitor4);
        rollerCoaster.addVisitorToQueue(visitor5);

        // Print queue
        rollerCoaster.printQueue();

        // Remove one visitor
        rollerCoaster.removeVisitorFromQueue();

        // Print queue again
        rollerCoaster.printQueue();
    }

    /**
     * Part 4A: Ride history demonstration
     */
    public void partFourA() {
        System.out.println("\n--- Part 4A: Ride History ---");

        Employee operator = new Employee("Sarah Manager", 35, "sarah@park.com", "E002", "Management");
        Ride waterRide = new Ride("Water Splash", "Water Ride", operator, 4);

        // Create visitors
        Visitor visitor1 = new Visitor("Frank", 40, "frank@email.com", "V006", "General");
        Visitor visitor2 = new Visitor("Grace", 32, "grace@email.com", "V007", "VIP");
        Visitor visitor3 = new Visitor("Henry", 27, "henry@email.com", "V008", "Student");
        Visitor visitor4 = new Visitor("Ivy", 29, "ivy@email.com", "V009", "General");
        Visitor visitor5 = new Visitor("Jack", 45, "jack@email.com", "V010", "Senior");

        // Add to history
        waterRide.addVisitorToHistory(visitor1);
        waterRide.addVisitorToHistory(visitor2);
        waterRide.addVisitorToHistory(visitor3);
        waterRide.addVisitorToHistory(visitor4);
        waterRide.addVisitorToHistory(visitor5);

        // Check visitor
        waterRide.checkVisitorFromHistory(visitor1);

        // Print number of visitors
        System.out.println("Number of visitors in history: " + waterRide.numberOfVisitors());

        // Print ride history
        waterRide.printRideHistory();
    }

    /**
     * Part 4B: Sorting demonstration
     */
    public void partFourB() {
        System.out.println("\n--- Part 4B: Sorting ---");

        Employee operator = new Employee("Mike Technician", 28, "mike@park.com", "E003", "Technical");
        Ride ferrisWheel = new Ride("Ferris Wheel", "Family Ride", operator, 6);

        // Create visitors for sorting
        Visitor visitor1 = new Visitor("Zack", 25, "zack@email.com", "V011", "General");
        Visitor visitor2 = new Visitor("Alice", 30, "alice@email.com", "V012", "VIP");
        Visitor visitor3 = new Visitor("Charlie", 22, "charlie@email.com", "V013", "Student");
        Visitor visitor4 = new Visitor("Alice", 25, "alice2@email.com", "V014", "General");
        Visitor visitor5 = new Visitor("Bob", 35, "bob@email.com", "V015", "Senior");

        // Add to history
        ferrisWheel.addVisitorToHistory(visitor1);
        ferrisWheel.addVisitorToHistory(visitor2);
        ferrisWheel.addVisitorToHistory(visitor3);
        ferrisWheel.addVisitorToHistory(visitor4);
        ferrisWheel.addVisitorToHistory(visitor5);

        // Print before sorting
        System.out.println("Before sorting:");
        ferrisWheel.printRideHistory();

        // Sort
        ferrisWheel.sortRideHistory(new VisitorComparator());

        // Print after sorting
        System.out.println("After sorting:");
        ferrisWheel.printRideHistory();
    }

    /**
     * Part 5: Run ride cycle
     */
    public void partFive() {
        System.out.println("\n--- Part 5: Run Ride Cycle ---");

        Employee operator = new Employee("Lisa Controller", 32, "lisa@park.com", "E004", "Control");
        Ride carousel = new Ride("Carousel", "Family Ride", operator, 3);

        // Create 10 visitors
        for (int i = 1; i <= 10; i++) {
            Visitor visitor = new Visitor("Visitor" + i, 20 + i, "visitor" + i + "@email.com",
                    "V" + (100 + i), "General");
            carousel.addVisitorToQueue(visitor);
        }

        // Print queue before
        System.out.println("Before running cycle:");
        carousel.printQueue();

        // Run one cycle
        carousel.runOneCycle();

        // Print queue after
        System.out.println("After running cycle:");
        carousel.printQueue();

        // Print ride history
        System.out.println("Ride history:");
        carousel.printRideHistory();
    }

    /**
     * Part 6: File export
     */
    public void partSix() {
        System.out.println("\n--- Part 6: File Export ---");

        Employee operator = new Employee("Tom Exporter", 40, "tom@park.com", "E005", "Operations");
        Ride exportRide = new Ride("Export Ride", "General", operator, 2);

        // Create visitors
        Visitor visitor1 = new Visitor("ExportAlice", 26, "exportalice@email.com", "V201", "VIP");
        Visitor visitor2 = new Visitor("ExportBob", 31, "exportbob@email.com", "V202", "General");
        Visitor visitor3 = new Visitor("ExportCharlie", 23, "exportcharlie@email.com", "V203", "Student");
        Visitor visitor4 = new Visitor("ExportDiana", 29, "exportdiana@email.com", "V204", "VIP");
        Visitor visitor5 = new Visitor("ExportEve", 36, "exporteve@email.com", "V205", "Senior");

        // Add to history
        exportRide.addVisitorToHistory(visitor1);
        exportRide.addVisitorToHistory(visitor2);
        exportRide.addVisitorToHistory(visitor3);
        exportRide.addVisitorToHistory(visitor4);
        exportRide.addVisitorToHistory(visitor5);

        // Export to file
        exportRide.exportRideHistory("ride_history.csv");
    }

    /**
     * Part 7: File import
     */
    public void partSeven() {
        System.out.println("\n--- Part 7: File Import ---");

        Employee operator = new Employee("Nancy Importer", 38, "nancy@park.com", "E006", "Operations");
        Ride importRide = new Ride("Import Ride", "General", operator, 2);

        // Import from file
        importRide.importRideHistory("ride_history.csv");

        // Verify import
        System.out.println("Number of visitors imported: " + importRide.numberOfVisitors());
        importRide.printRideHistory();
    }

    /**
     * Demonstrate exception handling
     */
    public void demoExceptionHandling() {
        System.out.println("\n--- Exception Handling Demonstration ---");

        try {
            // This will throw ThemeParkException
            new Visitor("", -5, "invalid", "XXX", "InvalidType");
        } catch (ThemeParkException e) {
            System.out.println("Caught ThemeParkException: " + e.getMessage());
        }

        try {
            // This will also throw ThemeParkException
            new Ride("", "InvalidType", null, 0);
        } catch (ThemeParkException e) {
            System.out.println("Caught ThemeParkException: " + e.getMessage());
        }
    }
}