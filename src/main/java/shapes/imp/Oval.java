package shapes.imp;

import shapes.ShapeOnPlane;

public class Oval extends ShapeOnPlane {

    private final double sideA;
    private final double sideB;

    protected Oval(String name, double startCoordinateX, double startCoordinateY, double sideA, double sideB) {
        super(name, startCoordinateX, startCoordinateY, sideA, sideB);
        if(verifySidesOfOval(sideA, sideB)) {
            this.sideA = sideA;
            this.sideB = sideB;
        }else {
            this.sideA = ShapeOnPlane.DEFAULT_LENGTH;
            this.sideB = ShapeOnPlane.DEFAULT_LENGTH / 2;
        }
    }

    private boolean verifySidesOfOval(double sideA, double sideB){
        if(sideA > 0 && sideB > 0){
            return sideA > sideB;
        }else
            return false;
    }

    @Override
    public double getSquare() {
        return Math.PI * sideA * sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }
}
