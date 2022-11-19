/**
 * @author Cedric Dimatulac
 * @version 1.0 (11/15/22)
 * @since 1.0
 * A simple Person class with an attribute for name, gender, and marital status
 */
public class Person {
    private String name;
    private String gender;
    private String maritalStatus;

    /**
     * Constructor
     * @param name
     * @param gender
     * @param maritalStatus
     */
    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }
}
