package shapes.plane.imp;

import shapes.plane.ShapeOnPlane;

public class Oval extends ShapeOnPlane {

    private double sideA;
    private double sideB;

    public Oval(double sideA, double sideB) {
        this(0, 0, sideA, sideB);
    }

    public Oval(double startCoordinateX, double startCoordinateY, double sideA, double sideB) {
        super("Oval", startCoordinateX, startCoordinateY, sideA, sideB);
        if (verifySidesOfOval(sideA, sideB)) {
            setSideA(sideA);
            setSideB(sideB);
        }
    }

    private boolean verifySidesOfOval(double sideA, double sideB) {
        return sideA > sideB;
    }

    @Override
    public double getArea() {
        return Math.PI * sideA * sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        if (sideA > 0) {
            this.sideA = sideA;
        }
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        if (sideB > 0) {
            this.sideB = sideB;
        }
    }
}
