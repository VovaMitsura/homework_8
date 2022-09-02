package shapes.imp;

import shapes.ShapeOnPlane;

public class Circle extends ShapeOnPlane {

    private final double radius;

    public Circle(double startCoordinateX, double startCoordinateY,double radius) {
        super("Circle", startCoordinateX, startCoordinateY, radius * 2, radius * 2);
        if(radius > 0 && radius < 50){
            this.radius = radius;
        }else
            this.radius = DEFAULT_LENGTH;
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }
}
