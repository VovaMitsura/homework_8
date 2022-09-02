package shapes.imp;

import shapes.ShapeOnPlane;

public class SemiCircle extends ShapeOnPlane {

    private final double sideA;
    private final double radius;

    protected SemiCircle(double startCoordinateX, double startCoordinateY, double sideA, double radius) {
        super("Semi-circle", startCoordinateX, startCoordinateY, sideA, radius);
        if(verifySideAndRadius(sideA, radius)){
            this.sideA = sideA;
            this.radius = radius;
        }else {
            this.sideA = ShapeOnPlane.DEFAULT_LENGTH;
            this.radius = ShapeOnPlane.DEFAULT_LENGTH / 2;
        }
    }

    private boolean verifySideAndRadius(double sideA, double radius){
        if(sideA > 0 && radius > 0){
            return sideA == radius * 2;
        }else
            return false;
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.pow(radius, 2) / 2;
    }

    public double getSideA() {
        return sideA;
    }

    public double getRadius() {
        return radius;
    }
}
