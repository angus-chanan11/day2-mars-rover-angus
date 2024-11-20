package org.example;

public interface Orientation {
    public static final int MOVE_STEP_SIZE = 1;
    public static final int MOVE_BACKWARD_STEP_SIZE = 1;

    public Orientation turnLeft();
    public Orientation turnRight();
    public String getDirection();
    public void moveForward(Coordinate coordinate);
    public void moveBackward(Coordinate coordinate);
}
