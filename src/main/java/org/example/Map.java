package org.example;

public enum Map {
    Ascent(2),
    Bind(2),
    Breeze(2),
    Fracture(2),
    Haven(3),
    Icebox(2),
    Lotus(3),
    Pearl(2),
    Split(2),
    Sunset(2);

    private final int sideNumber;

    Map(int sideNumber) {
        this.sideNumber = sideNumber;
    }


}
