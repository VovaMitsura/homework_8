package shapes.sides.two;

import shapes.sides.one.OneSideShape;

public abstract class TwoSidesShape extends OneSideShape {

    private double sideB;

    protected TwoSidesShape(String name, double sideA, double sideB) {
        super(name, sideA);
        if(verifyTwoSides(sideA, sideB)) {
            this.sideB = sideB;
        }
    }

    protected boolean verifyTwoSides(double sideA, double sideB){
        if(verifySide(sideA) && verifySide( sideB)){
            return sideA > sideB;
        }
        return false;
    }

    public double getSideB() {
        return sideB;
    }
}
