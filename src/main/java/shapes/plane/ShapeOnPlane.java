package shapes.plane;

import shapes.Shape;

public abstract class ShapeOnPlane extends Shape {

    private double startCoordinateX;
    private double startCoordinateY;
    private double length;
    private double height;

    protected ShapeOnPlane(String name, double startCoordinateX, double startCoordinateY) {
        this(name, startCoordinateX, startCoordinateY, 0, 0);
    }

    protected ShapeOnPlane(String name, double startCoordinateX, double startCoordinateY, double length, double height) {
        super(name);
        setStartCoordinateX(startCoordinateX);
        setStartCoordinateY(startCoordinateY);
        setLength(length);
        setHeight(height);
    }

    public double getStartCoordinateX() {
        return startCoordinateX;
    }

    public void setStartCoordinateX(double startCoordinateX) {
        this.startCoordinateX = startCoordinateX;
    }

    public double getStartCoordinateY() {
        return startCoordinateY;
    }

    public void setStartCoordinateY(double startCoordinateY) {
        this.startCoordinateY = startCoordinateY;
    }

    public double getLength() {
        return length;
    }


    private boolean notNegative(double length) {
        return length >= 0;
    }

    public void setLength(double length) {
        if (notNegative(length))
            this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (notNegative(height))
            this.height = height;
    }
}
