/**
 * Abstract class representing a person in the theme park system
 * Base class for Employee and Visitor
 */
public abstract class Person {
    private final String name;
    private final int age;
    private final String email;

    /**
     * Constructor for Person class
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
}
