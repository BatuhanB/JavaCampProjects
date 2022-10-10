package Models;

public class Instructor extends BaseEntity{
    private String firstName;
    private String lastName;
    private int age;
    private String description;


    public Instructor(int id, String firstName, String lastName, int age, String description) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.description = description;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
