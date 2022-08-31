package shapes.sides.one;

import shapes.Shape;

public abstract class OneSideShape extends Shape {

    private double sideA;

    protected OneSideShape(String name, double sideA) {
        super(name);
        if(verifySide(sideA)) {
            this.sideA = sideA;
        }
    }

    protected boolean verifySide(double sideA){
        return sideA > 0;
    }

    public double getSideA() {
        return sideA;
    }

}
