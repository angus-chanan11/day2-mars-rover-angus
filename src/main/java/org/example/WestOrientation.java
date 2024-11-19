package org.example;

public class WestOrientation implements Orientation{
    @Override
    public Orientation turnLeft() {
        return new SouthOrientation();
    }

    @Override
    public Orientation turnRight() {
        return new NorthOrientation();
    }

    @Override
    public String getDirection() {
        return "W";
    }
}
