import printers.ConsoleShapePrinter;
import printers.ShapePrinter;
import shapes.imp.biangle.SimpleBiangle;
import shapes.imp.circle.SimpleCircle;
import shapes.imp.quad.Rectangle;
import shapes.imp.quad.Square;
import shapes.imp.triangle.RightTriangle;
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
        printShapesToConsole(shapes);
    }

    private static void printShapesToConsole(List<Shape> shapeList) {
        ShapePrinter shapePrinter = new ConsoleShapePrinter();
        for (Shape shape : shapeList) {
            shapePrinter.printShape(shape);
        }
    }

}
