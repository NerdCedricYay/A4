import java.util.ArrayList;
import java.util.List;
/**
 * @author Cedric Dimatulac
 * @version 1.0 (11/15/22)
 * @since 1.0
 * Implements Criteria and overrides its meetCriteria function by having the function take in the given list and returning a new list of only female Persons
 */
public class CriteriaFemale implements Criteria{

    /**
     * @param persons
     * @return a list of female persons
     */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();

        for (Person p : persons){
            if(p.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(p);
            }
        }
        return femalePersons;
    }
}
