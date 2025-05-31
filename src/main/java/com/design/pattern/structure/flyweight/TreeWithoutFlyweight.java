package com.design.pattern.structure.flyweight;

import java.awt.image.BufferedImage;

public class TreeWithoutFlyweight {
    private final int x;
    private final int y;
    private final String name;
    private final String color;
    private final BufferedImage texture;

    public TreeWithoutFlyweight(int x, int y, String name, String color, BufferedImage texture) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw() {
        System.out.printf("Draw tree %s at (%d, %d)%n", name, x, y);
    }
}
