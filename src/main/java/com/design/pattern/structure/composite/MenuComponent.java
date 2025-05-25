package com.design.pattern.structure.composite;

public abstract class MenuComponent {

    String name;
    String requiredRole;
    protected MenuComponent parent;

    public MenuComponent() {
    }

    public MenuComponent(String name, String requiredRole, MenuComponent parent) {
        this.name = name;
        this.requiredRole = requiredRole;
        this.parent = parent;
    }

    public boolean hasAccess(User user){
        return user.hasRole(requiredRole);
    }

    public boolean hasAccessAtButton(User user,String buttonId){
        return false;
    }

    public boolean hasFullAccess(User user){
        if(!hasAccess(user)){
            return false;
        }

        if(parent != null){
            return parent.hasFullAccess(user);
        }

        return true;
    }

    // ✅ 트리 출력용 메서드
    public void printMenuTree(int indent) {
        System.out.printf("%s- %s (%s)%n", " ".repeat(indent * 2), name, requiredRole);
    }

    public String getName() {
        return name;
    }

    public String getRequiredRole() {
        return requiredRole;
    }

    public MenuComponent getParent() {
        return parent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRequiredRole(String requiredRole) {
        this.requiredRole = requiredRole;
    }

    public void setParent(MenuComponent parent) {
        this.parent = parent;
    }
}
