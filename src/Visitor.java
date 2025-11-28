/**
 * Visitor class representing theme park visitors
 * Extends Person class
 */
public class Visitor extends Person {
    private final String visitorId;
    private final String ticketType;

    /**
     * Constructor for Visitor class
     */
    public Visitor(String name, int age, String email, String visitorId, String ticketType) {
        super(name, age, email);
        if (visitorId == null || !visitorId.matches("V\\d{3}")) {
            throw new ThemeParkException("Visitor ID must be in format E followed by three digits");
        }
        String[] validTypes = {"General", "VIP", "Student", "Senior", "Child"};
        if (ticketType == null || !java.util.Arrays.asList(validTypes).contains(ticketType)) {
            throw new ThemeParkException("Invalid ticket type");
        }
        this.visitorId = visitorId;
        this.ticketType = ticketType;
    }

    // Getter for visitor ID
    public String getVisitorId() {
        return visitorId;
    }

    // Getter for ticket type
    public String getTicketType() {
        return ticketType;
    }

    /**
     * String representation of Visitor
     */
    @Override
    public String toString() {
        return "Visitor: " + getName() + " (ID: " + visitorId + ", Ticket: " + ticketType + ")";
    }
}