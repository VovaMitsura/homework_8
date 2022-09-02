package shapes.imp;

import shapes.ShapeOnPlane;

public class Oval extends ShapeOnPlane {

    private double sideA;
    private double sideB;

    public Oval(String name, double startCoordinateX, double startCoordinateY, double sideA, double sideB) {
        super(name, startCoordinateX, startCoordinateY, sideA, sideB);
        if (verifySidesOfOval(sideA, sideB)) {
            setSideA(sideA);
            setSideB(sideB);
        }
    }

    private boolean verifySidesOfOval(double sideA, double sideB) {
        return sideA > sideB;
    }

    @Override
    public double getSquare() {
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
