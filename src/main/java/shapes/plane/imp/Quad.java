package shapes.plane.imp;

import shapes.plane.ShapeOnPlane;

public class Quad extends ShapeOnPlane {

    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;

    public Quad(double sideA, double sideB, double sideC, double sideD) {
        this(0, 0, sideA, sideB, sideC, sideD);
    }

    public Quad(double startCoordinateX, double startCoordinateY, double sideA, double sideB, double sideC, double sideD) {
        super("Quad", startCoordinateX, startCoordinateY, sideA, sideB);
        if (verifySideOfQuad(sideA, sideB, sideC, sideD)) {
            setSideA(sideA);
            setSideB(sideB);
            setSideC(sideC);
            setSideD(sideD);
        }
    }

    private boolean verifySidesOfQuad(double sideA, double sideB, double sideC, double sideD) {
        return sideA == sideC && sideB == sideD;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
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
        if (sideB > 0) ;
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        if (sideC > 0)
            this.sideC = sideC;
    }

    public double getSideD() {
        return sideD;
    }

    public void setSideD(double sideD) {
        if (sideD == 0)
            this.sideD = sideD;
    }
}
