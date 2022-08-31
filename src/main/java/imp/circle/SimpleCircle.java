package imp.circle;

import enums.Shapes;
import shapes.sides.one.OneSideShape;

public class SimpleCircle extends OneSideShape {

    public SimpleCircle(double radius) {
        super(Shapes.CIRCLE.getName(), radius);
    }

    @Override
    public String getForm() {
        return Shapes.CIRCLE.getForm();
    }
}
