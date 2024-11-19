package org.example;


public class Main {
    public static void main(String[] args) {
        MarsRover rover = new MarsRover();

        String report = rover.showStatus();

        System.out.println(report);
    }
}