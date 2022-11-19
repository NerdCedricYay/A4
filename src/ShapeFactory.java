/**
 * @author Cedric Dimatulac
 * @version 1.0 (11/15/22)
 * @since 1.0
 * A class that utilizes the Factory design pattern by generating an object of a concrete class when a Shape is specified
 */
public class ShapeFactory {

    /**
     * @param shapeType
     * @return an object of the concrete class that is specified by the shapeType, null if otherwise
     */
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        else if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        else if(shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
