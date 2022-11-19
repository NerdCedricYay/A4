import java.util.List;

/**
 * @author Cedric Dimatulac
 * @version 1.0 (11/15/22)
 * @since 1.0
 * Criteria interface with method meetCriteria that takes in a list of Persons
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
