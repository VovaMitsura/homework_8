package shapes.imp;

import shapes.ShapeOnPlane;

public class Quad extends ShapeOnPlane {

    private final double sideA;
    private final double sideB;
    private final double sideC;
    private final double sideD;

    public Quad(double startCoordinateX, double startCoordinateY, double sideA, double sideB, double sideC, double sideD) {
        super("Quad", startCoordinateX, startCoordinateY, sideA, sideB);
        if (verifySideOfQuad(sideA, sideB, sideC, sideD)) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
            this.sideD = sideD;
        }else {
            this.sideA = this.sideC = 2 * ShapeOnPlane.DEFAULT_LENGTH;
            this.sideB = this.sideD = ShapeOnPlane.DEFAULT_LENGTH;
        }
    }

    private boolean verifySideOfQuad(double sideA, double sideB, double sideC, double sideD) {
        if (sideA > 0 && sideB > 0 && sideC > 0 && sideD > 0) {
            return sideA == sideC && sideB == sideD;
        }else
            return false;
    }

    @Override
    public double getSquare() {
        return sideA * sideB;
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

    public double getSideD() {
        return sideD;
    }
}
