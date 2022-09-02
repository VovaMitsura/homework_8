package shapes.imp;

import shapes.ShapeOnPlane;

public class SemiCircle extends ShapeOnPlane {

    private double sideA;
    private double radius;

    public SemiCircle(double startCoordinateX, double startCoordinateY, double sideA, double radius) {
        super("Semi-circle", startCoordinateX, startCoordinateY, sideA, radius);
        if (verifySideAndRadiusOfSemiCircle(sideA, radius)) {
            setSideA(sideA);
            setRadius(radius);
        }
    }

    private boolean verifySideAndRadiusOfSemiCircle(double sideA, double radius) {
        return sideA == radius * 2;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2) / 2;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        if (sideA > 0) {
            this.sideA = sideA;
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius > 0) {
            this.radius = radius;
        }
    }
}
