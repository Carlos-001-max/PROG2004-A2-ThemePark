/**
 * Employee class representing theme park staff
 */
public class Employee extends Person {
    private String employeeId;
    private String department;

    /**
     * Default constructor
     */
    @SuppressWarnings("unused")
    public Employee() {
        super();
        this.employeeId = "E000";
        this.department = "Operations";
    }

    /**
     * Parameterized constructor
     */
    public Employee(String name, int age, String email, String employeeId, String department) {
        super(name, age, email);
        if (employeeId == null || !employeeId.matches("E\\d{3}")) {
            throw new ThemeParkException("Employee ID must be in format E followed by three digits");
        }
        if (department == null || department.trim().isEmpty()) {
            throw new ThemeParkException("Department cannot be null or empty");
        }
        this.employeeId = employeeId;
        this.department = department;
    }

    // Getters
    public String getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    // Setters
    public void setEmployeeId(String employeeId) {
        if (employeeId == null || !employeeId.matches("E\\d{3}")) {
            throw new ThemeParkException("Employee ID must be in format E followed by three digits");
        }
        this.employeeId = employeeId;
    }

    public void setDepartment(String department) {
        if (department == null || department.trim().isEmpty()) {
            throw new ThemeParkException("Department cannot be null or empty");
        }
        this.department = department;
    }

    /**
     * String representation of Employee
     */
    @Override
    public String toString() {
        return "Employee: " + getName() + " (ID: " + employeeId + ", Dept: " + department + ")";
    }
}