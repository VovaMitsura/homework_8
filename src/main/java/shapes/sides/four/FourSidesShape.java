package shapes.sides.four;

import shapes.sides.three.ThreeSidesShape;

/*
 * more specific class, which represent shape with one four
 * */
public abstract class FourSidesShape extends ThreeSidesShape {

    private double sideD;

    protected FourSidesShape(String name, double sideA, double sideB, double sideC, double sideD) {
        super(name, sideA, sideB, sideC);
        if(verifyFourSides(sideA, sideB ,sideC ,sideD)){
            this.sideD =  sideD;
        }
    }

    protected boolean verifyFourSides(double sideA, double sideB, double sideC, double sideD){
        if(verifyTwoSides(sideA, sideB) && verifyTwoSides(sideC, sideD)){
            return sideA == sideC && sideC == sideD;
        }else
            return false;
    }


    public double getSideD() {
        return sideD;
    }
}
