package com.design.pattern.structure.flyweight;

import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static final Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color, BufferedImage texture) {
        String key = name + ":" + color;
        return treeTypes.computeIfAbsent(key, k -> new TreeType(name, color, texture));
    }

    public static int getTotalTreeTypes() {
        return treeTypes.size();
    }
}
