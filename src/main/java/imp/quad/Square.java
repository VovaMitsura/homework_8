package imp.quad;

import enums.Shapes;
import shapes.sides.four.FourSidesShape;

public class Square extends FourSidesShape {

    public Square(double sideA) {
        super(Shapes.SQUARE.getName(), sideA, sideA, sideA, sideA);
    }


    @Override
    public String getForm() {
        return Shapes.SQUARE.getForm();
    }
}