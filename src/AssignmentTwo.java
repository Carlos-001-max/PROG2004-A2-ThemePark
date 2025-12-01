/**
 * Main class for Theme Park Management System
 */
public class AssignmentTwo {

    /**
     * Main method
     */
    static void main(String[] args) {
        // Use args parameter to avoid warning
        if (args.length > 0) {
            System.out.println("Command line arguments: " + args.length);
        }

        System.out.println("=== Theme Park Management System ===");

        AssignmentTwo assignment = new AssignmentTwo();

        // Demonstrate default constructors and all methods
        assignment.demoAllMethods();

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
     * Demonstrate all getters and setters (including default constructors)
     */
    public void demoAllMethods() {
        System.out.println("\n=== Part 1 & 2: Demonstrating All Methods ===");

        // Test Person setters (using Employee as concrete implementation)
        System.out.println("\n1. Testing Person setters:");
        Employee testEmp = new Employee();
        testEmp.setName("Test Person");
        testEmp.setAge(25);
        testEmp.setEmail("test@example.com");
        System.out.println("   Person setters tested successfully");
        System.out.println("   Name: " + testEmp.getName());
        System.out.println("   Age: " + testEmp.getAge());
        System.out.println("   Email: " + testEmp.getEmail());

        // Test Employee getters and setters
        System.out.println("\n2. Testing Employee getters and setters:");
        Employee emp = new Employee();
        System.out.println("   Original Employee ID: " + emp.getEmployeeId());
        System.out.println("   Original Department: " + emp.getDepartment());

        emp.setEmployeeId("E999");
        emp.setDepartment("Testing Department");
        System.out.println("   Updated Employee ID: " + emp.getEmployeeId());
        System.out.println("   Updated Department: " + emp.getDepartment());
        System.out.println("   Full Employee: " + emp);

        // Test Visitor setters
        System.out.println("\n3. Testing Visitor setters:");
        Visitor vis = new Visitor();
        System.out.println("   Original Visitor ID: " + vis.getVisitorId());
        System.out.println("   Original Ticket Type: " + vis.getTicketType());

        vis.setVisitorId("V999");
        vis.setTicketType("VIP");
        System.out.println("   Updated Visitor ID: " + vis.getVisitorId());
        System.out.println("   Updated Ticket Type: " + vis.getTicketType());
        System.out.println("   Full Visitor: " + vis);

        // Test Ride getters and setters
        System.out.println("\n4. Testing Ride getters and setters:");
        Ride ride = new Ride();
        System.out.println("   Original Ride Name: " + ride.getRideName());
        System.out.println("   Original Ride Type: " + ride.getRideType());
        System.out.println("   Original Max Riders: " + ride.getMaxRider());
        System.out.println("   Original Cycles: " + ride.getNumOfCycles());
        System.out.println("   Original Operator: " + ride.getOperator());

        ride.setRideName("Test Roller Coaster");
        ride.setRideType("Thrill Ride");
        ride.setMaxRider(5);
        Employee newOperator = new Employee("Test Operator", 28, "operator@park.com", "E100", "Testing");
        ride.setOperator(newOperator);

        System.out.println("   Updated Ride Name: " + ride.getRideName());
        System.out.println("   Updated Ride Type: " + ride.getRideType());
        System.out.println("   Updated Max Riders: " + ride.getMaxRider());
        System.out.println("   Updated Operator: " + ride.getOperator());

        System.out.println("\nAll getters and setters tested successfully!");
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
        Visitor visitor2 = new Visitor("Ivy", 30, "ivy@email.com", "V002", "General");
        Visitor visitor3 = new Visitor("Aria", 20, "aria@email.com", "V003", "Student");
        Visitor visitor4 = new Visitor("Eva", 28, "eva@email.com", "V004", "VIP");
        Visitor visitor5 = new Visitor("Clara", 75, "clara@email.com", "V005", "General");

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
        Visitor visitor2 = new Visitor("Iris", 32, "iris@email.com", "V007", "VIP");
        Visitor visitor3 = new Visitor("Henry", 27, "henry@email.com", "V008", "Student");
        Visitor visitor4 = new Visitor("Peter", 29, "peter@email.com", "V009", "General");
        Visitor visitor5 = new Visitor("Jackson", 68, "jackson@email.com", "V010", "Senior");

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
        Visitor visitor2 = new Visitor("Lily", 30, "lily@email.com", "V012", "VIP");
        Visitor visitor3 = new Visitor("Chara", 22, "chara@email.com", "V013", "Student");
        Visitor visitor4 = new Visitor("Lucy", 25, "lucy@email.com", "V014", "General");
        Visitor visitor5 = new Visitor("Bob", 69, "bob@email.com", "V015", "Senior");

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
        Visitor visitor1 = new Visitor("ExportJennie", 26, "exporjennie@email.com", "V201", "VIP");
        Visitor visitor2 = new Visitor("ExportKara", 31, "exportkara@email.com", "V202", "General");
        Visitor visitor3 = new Visitor("ExportCharlie", 23, "exportcharlie@email.com", "V203", "Student");
        Visitor visitor4 = new Visitor("ExportRose", 29, "exportrose@email.com", "V204", "VIP");
        Visitor visitor5 = new Visitor("ExportRuth", 75, "exportruth@email.com", "V205", "Senior");

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