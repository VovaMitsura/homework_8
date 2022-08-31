package shapes;

import enums.Shapes;
import exceptions.IllegalNameException;
import interfaces.Paintable;

/*
* Abstract class shape, which define common behaviour for shapes
* */
public abstract class Shape implements Paintable {

    private final String name;

    /*
    * protected constructor, which could invoke inheritors. Throws NullPointerException
    * when null passed as argument. Throws IllegalNameException, if length of passed name is greater
    * than 20. If exception occur, assign default 'shape' name from enum Shapes
    * */
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

    /*
    * inheritors must implement getForm() method to paint shape
    * */
    @Override
    public void paint() {

        StringBuilder builder = new StringBuilder("********");
        builder.append(getName()).append("********\n").append(getForm());

        System.out.println(builder);
    }
}
