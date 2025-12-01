/**
 * Abstract Person class for theme park system
 */
public abstract class Person {
    private String name;
    private int age;
    private String email;

    /**
     * Default constructor
     */
    @SuppressWarnings("unused")
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.email = "unknown@example.com";
    }

    /**
     * Parameterized constructor
     */
    public Person(String name, int age, String email) {
        if (name == null || name.trim().isEmpty()) {
            throw new ThemeParkException("Name cannot be null or empty");
        }
        if (age < 0 || age > 120) {
            throw new ThemeParkException("Age must be between 0 and 120");
        }
        if (email == null || !email.contains("@")) {
            throw new ThemeParkException("Invalid email format");
        }
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new ThemeParkException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            throw new ThemeParkException("Age must be between 0 and 120");
        }
        this.age = age;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new ThemeParkException("Invalid email format");
        }
        this.email = email;
    }
}