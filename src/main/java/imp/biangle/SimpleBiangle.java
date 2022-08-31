package imp.biangle;

import enums.Shapes;
import shapes.sides.two.TwoSidesShape;

public class SimpleBiangle extends TwoSidesShape {

    public SimpleBiangle(double sideA, double sideB) {
        super(Shapes.BIANGLE.getName(), sideA, sideB);
    }

    @Override
    public String getForm() {
        return Shapes.BIANGLE.getForm();
    }
}
