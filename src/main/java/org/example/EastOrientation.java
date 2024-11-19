package org.example;

public class EastOrientation implements Orientation {
    @Override
    public Orientation turnLeft() {
        return new NorthOrientation();
    }

    @Override
    public Orientation turnRight() {
        return new SouthOrientation();
    }

    @Override
    public String getDirection() {
        return "E";
    }
}
