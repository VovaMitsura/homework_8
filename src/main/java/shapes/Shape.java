package shapes;

import enums.Shapes;
import exceptions.IllegalNameException;
import interfaces.Paintable;

public abstract class Shape implements Paintable {

    private final String name;

    protected Shape(String name) {
        if(name == null){
            this.name = Shapes.SHAPE.getName();
            throw new NullPointerException("Null cannot be assigned to name");
        }else if(name.length() > 20){
            this.name = Shapes.SHAPE.getName();
            throw new IllegalNameException("Name is too long");
        }else
            this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void paint() {

        StringBuilder builder = new StringBuilder("********");
        builder.append(getName()).append("********\n").append(getForm());

        System.out.println(builder);
    }
}
