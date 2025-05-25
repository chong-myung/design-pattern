package com.design.pattern.structure.composite;

import java.util.ArrayList;
import java.util.List;

public class MenuGroup extends MenuComponent{

    private List<MenuComponent> children = new ArrayList<>();

    public MenuGroup() {
    }

    public MenuGroup(String name, String requiredRole, MenuComponent parent) {
        super(name,requiredRole,parent);
    }

    public void addChild(MenuComponent menu) {
        children.add(menu);
    }

    public void removeChild(MenuComponent menu){
        children.remove(menu);
    }

    @Override
    public void printMenuTree(int indent) {
        System.out.println("부모 여기");
        super.printMenuTree(indent);
        for (MenuComponent child : children) {
            child.printMenuTree(indent + 1);
        }
    }

}
