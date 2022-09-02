package shapes;

public abstract class ShapeOnPlane extends Shape {

    private static final double DEFAULT_START_OF_COORDINATES = 0;

    private double startCoordinateX;
    private double startCoordinateY;


    protected ShapeOnPlane(String name) {
        super(name);
        this.startCoordinateX = this.startCoordinateY = DEFAULT_START_OF_COORDINATES;
    }

    protected ShapeOnPlane(String name, double startCoordinateX, double startCoordinateY) {
        super(name);
        if(verifyStartOfCoordinatesOnPlane(startCoordinateX, startCoordinateY)) {
            this.startCoordinateX = startCoordinateX;
            this.startCoordinateY = startCoordinateY;
        }
    }

    private boolean verifyStartOfCoordinatesOnPlane(double startCoordinateX, double startCoordinateY){
        return startCoordinateX >= 0 && startCoordinateY >= 0;
    }

    public double getStartCoordinateX() {
        return startCoordinateX;
    }

    public double getStartCoordinateY() {
        return startCoordinateY;
    }
}
