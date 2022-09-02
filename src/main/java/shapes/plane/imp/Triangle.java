package shapes.plane.imp;

import shapes.plane.ShapeOnPlane;

public class Triangle extends ShapeOnPlane {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this(0, 0, sideA, sideB, sideC);
    }

    public Triangle(double startCoordinateX, double startCoordinateY, double sideA, double sideB, double sideC) {
        super("Triangle", startCoordinateX, startCoordinateY);
        if (verifySidesOfTriangle(sideA, sideB, sideC)) {
            setSideA(sideA);
            setSideB(sideB);
            setSideC(sideC);
        }

        setLength(getSideA());
        setHeight(getHeight());
    }

    private boolean verifySidesOfTriangle(double sideA, double sideB, double sideC) {
        return sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA;
    }

    @Override
    public double getHeight() {
        double square = getArea();
        return (2 * square) / sideA;
    }

    @Override
    public double getArea() {
        double p = getHalfPerimeter();
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    private double getHalfPerimeter() {
        return (sideA + sideB + sideC) / 2;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        if (sideA > 0)
            this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        if (sideB > 0)
            this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        if (sideC > 0)
            this.sideC = sideC;
    }
}
