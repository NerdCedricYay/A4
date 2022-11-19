/**
 * @author Cedric Dimatulac
 * @version 1.0 (11/15/22)
 * @since 1.0
 * A class with a private constructor and a static instance of itself as to only create one object
 */
public class Singleton {

    /**
     * Making the constructor private so that a Singleton cannot be instantiated
     */
    private static Singleton instance = new Singleton();
    private Singleton() { }

    /**
     * @return the only object available
     */
    public static Singleton getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
