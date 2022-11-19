import java.util.ArrayList;
import java.util.List;

/**
 * @author Cedric Dimatulac
 * @version 1.0 (11/15/22)
 * @since 1.0
 * Demo class demonstrating the Filter design pattern
 */
public class CriteriaPatternDemo {

    /**
     * Prints out a list of people
     * @param people
     */
    public static void printPersons(List<Person> people){
        for (Person p : people){
            System.out.println("Person : [ Name : " + p.getName() + ", Gender : " + p.getGender() + ", Marital Status : "+ p.getMaritalStatus() + " ]");
        }
    }

    public static void main(String[]args){
        List<Person> people = new ArrayList<>();

        people.add(new Person("Cedric","Male","Single"));
        people.add(new Person("Robert","Male","Single"));
        people.add(new Person("John","Male","Married"));
        people.add(new Person("Laura","Female","Married"));
        people.add(new Person("Mike","Male","Single"));
        people.add(new Person("Diana","Female","Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();

        System.out.println("Males: ");
        printPersons(male.meetCriteria(people));

        System.out.println("Females: ");
        printPersons(female.meetCriteria(people));

    }
}
