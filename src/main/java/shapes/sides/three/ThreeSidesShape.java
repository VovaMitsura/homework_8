package shapes.sides.three;

import shapes.sides.two.TwoSidesShape;

/*
 * more specific class, which represent shape with one three
 * */
public abstract class ThreeSidesShape extends TwoSidesShape {

    private double sideC;

    protected ThreeSidesShape(String name, double sideA, double sideB, double sideC) {
        super(name, sideA, sideB);
        if(verifyThreeSides(sideA ,sideB ,sideC)){
            this.sideC = sideC;
        }
    }

    protected boolean verifyThreeSides(double sideA, double sideB, double sideC){
        if(verifyTwoSides(sideA, sideB) && verifyTwoSides(sideB, sideC)){
            return sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA;
        }else
            return false;
    }

    public double getSideC() {
        return sideC;
    }
}
