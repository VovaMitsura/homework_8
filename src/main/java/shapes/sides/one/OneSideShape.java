package shapes.sides.one;

import shapes.Shape;

/*
* more specific class, which represent shape with one side
* */
public abstract class OneSideShape extends Shape {

    private double sideA;

    protected OneSideShape(String name, double sideA) {
        super(name);
        if(verifySide(sideA)) {
            this.sideA = sideA;
        }
    }

    /*
    * each classes, which extends OneSidesShape could override verifySide() method
    * to make more concrete restriction
    * */
    protected boolean verifySide(double sideA){
        return sideA > 0;
    }

    public double getSideA() {
        return sideA;
    }

}
