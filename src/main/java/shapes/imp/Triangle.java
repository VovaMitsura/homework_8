package shapes.imp;

import shapes.ShapeOnPlane;

public class Triangle extends ShapeOnPlane {

    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double startCoordinateX, double startCoordinateY, double sideA, double sideB, double sideC) {
        super("Triangle", startCoordinateX, startCoordinateY);

        if(verifySideOfTriangle(sideA, sideB, sideC)) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }else {
            this.sideA = this.sideB = this.sideC = ShapeOnPlane.DEFAULT_LENGTH;
        }
    }

    private boolean verifySideOfTriangle(double sideA, double sideB, double sideC){
        if(sideA > 0 && sideB > 0 && sideC > 0){
            return sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA;
        }else
            return false;
    }

    public double getHeight(){
        double square = getSquare();
        return (2 * square) / sideA;
    }

    @Override
    public double getSquare() {
        double p = getHalfPerimeter();
        return Math.sqrt(p *  (p - sideA) * (p - sideB) * (p - sideC));
    }

    private double getHalfPerimeter(){
        return (sideA + sideB + sideC) / 2;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }
}
