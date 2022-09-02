package shapes;

public class ShapeInSpace extends ShapeOnPlane {
    private static final double DEFAULT_START_OF_COORDINATE_Z = 0;

    private double startCoordinateZ;

    protected ShapeInSpace(String name) {
        super(name);
        this.startCoordinateZ = DEFAULT_START_OF_COORDINATE_Z;
    }

    protected ShapeInSpace(String name, double startCoordinateX, double startCoordinateY) {
        super(name, startCoordinateX, startCoordinateY);
    }

    public double getStartCoordinateZ() {
        return startCoordinateZ;
    }
}
