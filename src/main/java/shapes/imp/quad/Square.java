package shapes.imp.quad;

import shapes.sides.four.FourSidesShape;

public class Square extends FourSidesShape {

    public Square(double sideA) {
        super("Square", sideA, sideA, sideA, sideA);
    }
}