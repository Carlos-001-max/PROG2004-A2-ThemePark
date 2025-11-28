/**
 * Employee class representing theme park staff
 * Extends Person class
 */
public class Employee extends Person {
    private final String employeeId;
    private final String department;

    /**
     * Constructor for Employee class
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

    // Getter for employee ID - now used in toString
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * String representation of Employee
     */
    @Override
    public String toString() {
        return "Employee: " + getName() + " (ID: " + getEmployeeId() + ", Dept: " + department + ")";
    }
}