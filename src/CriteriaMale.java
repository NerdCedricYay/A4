import java.util.ArrayList;
import java.util.List;

/**
 * @author Cedric Dimatulac
 * @version 1.0 (11/15/22)
 * @since 1.0
 * Implements Criteria and overrides its meetCriteria function by having the function take in the given list and returning a new list of only male Persons
 */
public class CriteriaMale implements Criteria{

    /**
     * @param persons
     * @return a list of male persons
     */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();

        for (Person p : persons){
            if(p.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(p);
            }
        }
        return malePersons;
    }
}
