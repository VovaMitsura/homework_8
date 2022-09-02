package shapes;

public abstract class Shape {

    private static final int MAX_LENGTH_FOR_NAME = 20;
    private static final String DEFAULT_NAME_FOR_SHAPE = "Shape";

    private final String name;

    protected Shape(String name) {
        if (verifyName(name)) {
            this.name = name;
        } else
            this.name = DEFAULT_NAME_FOR_SHAPE;
    }

    private boolean verifyName(String name){
        return name != null && name.length() <= MAX_LENGTH_FOR_NAME;
    }

    public String getName() {
        return name;
    }

    public abstract  double getArea();
}
