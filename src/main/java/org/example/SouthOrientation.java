package org.example;

public class SouthOrientation implements Orientation{
    @Override
    public Orientation turnLeft() {
        return new EastOrientation();
    }

    @Override
    public Orientation turnRight() {
        return new WestOrientation();
    }

    @Override
    public String getDirection() {
        return "S";
    }
}
