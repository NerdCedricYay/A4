/**
 * @author Cedric Dimatulac
 * @version 1.0 (11/15/22)
 * @since 1.0
 * Demo class demonstrating the Singleton design pattern
 */
public class SingletonPatternDemo {
    public static void main (String[]args){
        /** illegal construct
         * Compile Time Error: The constructor Singleton() is not visible
         * Singleton object = new Singleton();
         */

        /**
         * Retrieving the only object available
         */
        Singleton object = Singleton.getInstance();

        /**
         * Display message
         */
        object.showMessage();
    }
}
