package com.design.pattern.structure.flyweight;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class Client {
    private static final int TREE_COUNT = 100000;



    public static void main(String[] args) {
        useFlyweight();
//        unUseFlyweight();
    }

    private static void useFlyweight(){
        Forest forest = new Forest();

        String[] names = {"Oak", "Pine", "Birch", "Maple"};
        String[] colors = {"Green", "Dark Green", "Yellow", "Brown"};
        BufferedImage[] textures = new BufferedImage[4];
        // Load or simulate 4 large textures
        for (int i = 0; i < 4; i++) {
            textures[i] = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        }

        for (int i = 0; i < TREE_COUNT; i++) {
            String name = names[i % 4];
            String color = colors[i % 4];
            BufferedImage texture = textures[i % 4];
            forest.plantTree(i % 1000, i / 1000, name, color, texture);
        }

        System.out.println("Total unique tree types: " + TreeFactory.getTotalTreeTypes());
        System.out.println("Total trees planted: " + TREE_COUNT);

        // forest.draw(); // Uncomment if needed for output

        long totalMemory = Runtime.getRuntime().totalMemory();
        long freeMemory = Runtime.getRuntime().freeMemory();
        long usedMemory = totalMemory - freeMemory;

        System.out.printf("Memory used with Flyweight: %.2f MB\n", usedMemory / 1024.0 / 1024.0);
    }

    private static void unUseFlyweight() {

        String[] names = {"Oak", "Pine", "Birch", "Maple"};
        String[] colors = {"Green", "Dark Green", "Yellow", "Brown"};
        List<TreeWithoutFlyweight> trees = new ArrayList<>();
        for (int i = 0; i < TREE_COUNT; i++) {
            String name = names[i % 4];
            String color = colors[i % 4];

            // 각 나무마다 새로운 이미지 생성 (메모리 낭비)
            BufferedImage texture = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
            trees.add(new TreeWithoutFlyweight(i % 1000, i / 1000, name, color, texture) );
        }

        System.out.println("Total trees planted: " + TREE_COUNT);

        long totalMemory = Runtime.getRuntime().totalMemory();
        long freeMemory = Runtime.getRuntime().freeMemory();
        long usedMemory = totalMemory - freeMemory;

        System.out.printf("Memory used without Flyweight: %.2f MB\n", usedMemory / 1024.0 / 1024.0);
    }

}
