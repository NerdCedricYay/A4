/**
 * @author Cedric Dimatulac
 * @version 1.0 (11/15/22)
 * @since 1.0
 * Rectangle class that implements Shape class that prints a message after the draw method is called
 */
public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
