package com.design.pattern.structure.composite;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class User {
    private Set<String> roles;

    public User(String... roles) {
        this.roles = new HashSet<>(Arrays.asList(roles));
    }

    public boolean hasRole(String role) {
        return roles.contains(role);
    }
}
