package imp.oval;

import enums.Shapes;
import shapes.sides.one.OneSideShape;

public class Oval extends OneSideShape {



    protected Oval(double sideA) {
        super(Shapes.OVAL.getName(), sideA);
    }

    @Override
    public String getForm() {
        return Shapes.OVAL.getForm();
    }
}
