package org.example;

public enum Command {
    M, L, R, B;

    public static Command commandFromString(String command) {
        return switch (command) {
            case "M" -> M;
            case "L" -> L;
            case "R" -> R;
            case "B" -> B;
            default -> throw new IllegalArgumentException("Invalid command");
        };
    }
}
