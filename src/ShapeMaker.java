/**
 * @author Cedric Dimatulac
 * @version 1.0 (11/15/22)
 * @since 1.0
 * A class that utilises the Facade design pattern by creating instances of all the classes that implement a common interface
 * This class provides simplified methods required by client and delegates calls to methods of existing system classes
 */
public class ShapeMaker {

    /**
     * Declares and initializes an object for all classes that implement the Shape interface
     */
    private Shape circle;
    private Shape rectangle;
    private Shape square;
    public ShapeMaker(){
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    /**
     * These methods uses the methods of the concrete classes and specifies which class' method gets called just by calling the method names
     */
    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
