package com.design.pattern.structure.composite;

import java.util.ArrayList;
import java.util.List;

public class MenuItem extends MenuComponent{

    private List<Button> buttons = new ArrayList<>();

    public MenuItem() {
    }

    public MenuItem(String name, String requiredRole, MenuComponent parent) {
        super(name,requiredRole,parent);
    }

    public void addButton(Button button) {
        buttons.add(button);
    }

    @Override
    public boolean hasAccessAtButton(User user , String buttonId){
        Button button = buttons.stream().filter(p -> buttonId.equals(p.getRequiredRole())).findFirst()
                .orElseThrow(RuntimeException::new);
        return user.hasRole(buttonId) && super.hasFullAccess(user);
    }

    @Override
    public void printMenuTree(int indent) {
        super.printMenuTree(indent);
        for (Button button : buttons) {
            System.out.printf("%s* %s (%s)%n", " ".repeat((indent + 1) * 2), button.getName(), button.getRequiredRole());
        }
    }

}
