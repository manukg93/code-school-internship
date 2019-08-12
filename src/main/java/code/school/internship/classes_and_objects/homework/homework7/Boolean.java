package code.school.internship.classes_and_objects.homework.homework7;

// import edu.codeschool.training.classes_objects.homework4.Book;

public class Boolean {
    private boolean value;

    // Constructors

    // Default constructor
    public Boolean() {
        this.value = false;
    }

    // Parameterized constructor
    public Boolean(boolean value) {
        this.value = value;
    }

    // Setter
    public void setValue(boolean booleanValue) {
        this.value = booleanValue;
    }

    // Getter
    public boolean isValue() {
        return this.value;
    }

    // Public methods
    public Boolean not() {
        return new Boolean(!this.value);
    }

    public Boolean and(Boolean other) {
        return new Boolean(this.value && other.value);
    }

    public Boolean or(Boolean other) {
        return new Boolean(this.value || other.value);
    }
}