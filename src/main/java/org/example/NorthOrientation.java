package org.example;

public class NorthOrientation implements Orientation {
    @Override
    public Orientation turnLeft() {
        return new WestOrientation();
    }

    @Override
    public Orientation turnRight() {
        return new EastOrientation();
    }

    @Override
    public String getDirection() {
        return "N";
    }
}
