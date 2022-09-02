package interfaces;

import shapes.Shape;

public class ConsoleShapePrinter implements Printer{

    private Shape shape;

    public ConsoleShapePrinter(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void print() {
        System.out.println(shape.getName());
    }
}
