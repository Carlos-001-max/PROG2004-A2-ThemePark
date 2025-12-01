/**
 * Visitor class representing theme park visitors
 */
public class Visitor extends Person {
    private String visitorId;
    private String ticketType;

    /**
     * Default constructor
     */
    @SuppressWarnings("unused")
    public Visitor() {
        super();
        this.visitorId = "V000";
        this.ticketType = "General";
    }

    /**
     * Parameterized constructor
     */
    public Visitor(String name, int age, String email, String visitorId, String ticketType) {
        super(name, age, email);
        if (visitorId == null || !visitorId.matches("V\\d{3}")) {
            throw new ThemeParkException("Visitor ID must be in format V followed by three digits");
        }
        String[] validTypes = {"General", "VIP", "Student", "Senior", "Child"};
        if (ticketType == null || !java.util.Arrays.asList(validTypes).contains(ticketType)) {
            throw new ThemeParkException("Invalid ticket type");
        }
        this.visitorId = visitorId;
        this.ticketType = ticketType;
    }

    // Getters
    public String getVisitorId() {
        return visitorId;
    }

    public String getTicketType() {
        return ticketType;
    }

    // Setters
    public void setVisitorId(String visitorId) {
        if (visitorId == null || !visitorId.matches("V\\d{3}")) {
            throw new ThemeParkException("Visitor ID must be in format V followed by three digits");
        }
        this.visitorId = visitorId;
    }

    public void setTicketType(String ticketType) {
        String[] validTypes = {"General", "VIP", "Student", "Senior", "Child"};
        if (ticketType == null || !java.util.Arrays.asList(validTypes).contains(ticketType)) {
            throw new ThemeParkException("Invalid ticket type");
        }
        this.ticketType = ticketType;
    }

    /**
     * String representation of Visitor
     */
    @Override
    public String toString() {
        return "Visitor: " + getName() + " (ID: " + visitorId + ", Ticket: " + ticketType + ")";
    }
}