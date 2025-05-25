package com.design.pattern.structure.composite;

public class Button {
    private String name;
    private String requiredRole;

    public Button(String name, String requiredRole) {
        this.name = name;
        this.requiredRole = requiredRole;
    }

    public boolean hasAccess(User user) {
        return user.hasRole(requiredRole);
    }

    public String getRequiredRole() {
        return requiredRole;
    }

    public String getName() {
        return name;
    }
}
