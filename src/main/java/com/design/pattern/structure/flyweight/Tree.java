package com.design.pattern.structure.flyweight;

public class Tree {
    int x ;
    int y ;
    TreeType treeType;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.treeType = type;
    }

    public void draw(){
        treeType.draw(x,y);
    }
}
