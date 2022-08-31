package imp.tringle;

import enums.Shapes;
import shapes.sides.three.ThreeSidesShape;

public class RightTriangle extends ThreeSidesShape {

    public RightTriangle(double sideA, double sideB, double sideC) {
        super(Shapes.TRIANGLE.getName(), sideA, sideB, sideC);
    }

    @Override
    public String getForm() {
        return Shapes.TRIANGLE.getForm();
    }
}
