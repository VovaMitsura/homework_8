package imp.quad;

import enums.Shapes;
import shapes.sides.four.FourSidesShape;

public class Rectangle extends FourSidesShape {


    public Rectangle(double sideA, double sideB, double sideC, double sideD) {
        super(Shapes.RECTANGLE.getName(), sideA, sideB, sideC, sideD);
    }


    @Override
    public String getForm() {
        return Shapes.RECTANGLE.getForm();
    }
}
