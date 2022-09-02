package shapes;

public abstract class ShapeOnPlane extends Shape {

    public static final double DEFAULT_LENGTH = 5;

    private double startCoordinateX;
    private double startCoordinateY;
    private double length;
    private double height;

    protected ShapeOnPlane(String name) {
        super(name);
    }

    protected ShapeOnPlane(String name, double startCoordinateX, double startCoordinateY) {
        this(name);
        this.startCoordinateX = startCoordinateX;
        this.startCoordinateY = startCoordinateY;
    }

    protected ShapeOnPlane(String name, double startCoordinateX, double startCoordinateY, double length, double height) {
        this(name, startCoordinateX, startCoordinateY);
        setLength(length);
        setHeight(height);
    }

    public double getStartCoordinateX() {
        return startCoordinateX;
    }

    public void setStartCoordinateX(double startCoordinateX) {
        this.startCoordinateX = startCoordinateX;
    }

    public double getStartCoordinateY() {
        return startCoordinateY;
    }

    public void setStartCoordinateY(double startCoordinateY) {
        this.startCoordinateY = startCoordinateY;
    }

    public double getLength() {
        return length;
    }


    private boolean notNegative(double length) {
        return length >= 0;
    }

    public void setLength(double length) {
        if (notNegative(length))
            this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (notNegative(height))
            this.height = height;
    }
}
