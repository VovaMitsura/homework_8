import printers.ConsoleShapePrinter;
import printers.ShapePrinter;
import shapes.Shape;
import shapes.plane.imp.Circle;
import shapes.plane.imp.Quad;
import shapes.plane.imp.SemiCircle;
import shapes.plane.imp.Triangle;

import java.util.List;

public class Demo {

    public static void main(String[] args) {
        Shape circle = new Circle(10);
        Shape rectangle = new Quad(10, 5, 10, 5);
        Shape square = new Quad(10, 10, 10, 10);
        Shape semiCircle = new SemiCircle(10, 5);
        Shape triangle = new Triangle(10, 10, 10);

        List<Shape> shapes = List.of(circle, rectangle, triangle, semiCircle, square);
        printShapesToConsole(shapes);
    }

    private static void printShapesToConsole(List<Shape> shapeList) {
        ShapePrinter shapePrinter = new ConsoleShapePrinter();
        for (Shape shape : shapeList) {
            shapePrinter.printShape(shape);
        }
    }
}
