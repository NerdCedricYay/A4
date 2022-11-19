/**
 * @author Cedric Dimatulac
 * @version 1.0 (11/15/22)
 * @since 1.0
 * Using the ShapeMaker class to draw various types of shapes
 */
public class FacadePatternDemo {
    public static void main(String[] args){
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
