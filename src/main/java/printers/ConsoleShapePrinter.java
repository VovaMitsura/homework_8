package printers;

import shapes.Shape;

public class ConsoleShapePrinter implements ShapePrinter{
    @Override
    public void printShape(Shape shape) {
        System.out.println(shape.getName());
    }
}
