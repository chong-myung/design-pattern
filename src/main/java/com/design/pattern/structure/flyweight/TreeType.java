package com.design.pattern.structure.flyweight;

import java.awt.image.BufferedImage;

public class TreeType {
    String name;
    String color;
    BufferedImage texture;

    public TreeType(String name, String color, BufferedImage texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(int x, int y) {
        System.out.printf("Draw tree of type %s at (%d, %d)%n", name, x, y);
    }
}
