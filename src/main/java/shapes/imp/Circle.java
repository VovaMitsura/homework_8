package shapes.imp;

import shapes.ShapeOnPlane;

public class Circle extends ShapeOnPlane {

    private double radius;

    public Circle(double startCoordinateX, double startCoordinateY, double radius) {
        super("Circle", startCoordinateX, startCoordinateY, radius * 2, radius * 2);
        setRadius(radius);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0 && radius < 50)
            this.radius = radius;
    }
}
