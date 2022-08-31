import imp.biangle.SimpleBiangle;
import imp.circle.SimpleCircle;
import imp.quad.Rectangle;
import imp.quad.Square;
import imp.tringle.RightTriangle;
import shapes.Shape;

import java.util.List;

public class Demo {

    public static void main(String[] args) {

        Shape circle = new SimpleCircle(10);
        Shape biangle = new SimpleBiangle(10, 10);
        Shape triangle = new RightTriangle(10, 10, 10);
        Shape rectangle = new Rectangle(10, 5, 10, 5);
        Shape square = new Square(10);


        List<Shape> shapes = List.of(circle, biangle, triangle, rectangle, square);
        showShapes(shapes);


    }

    /*
    * Method takes List of shapes and invoke paint() method on each elements;
    * */
    private static void showShapes(List<Shape> shapeList) {
        for (Shape shape : shapeList) {
            shape.paint();
        }
    }

}
