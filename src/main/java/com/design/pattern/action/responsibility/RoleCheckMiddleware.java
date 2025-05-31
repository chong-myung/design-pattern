package com.design.pattern.action.responsibility;

public class RoleCheckMiddleware extends Middleware{
    public boolean check(String email, String password) {
        System.out.println("이용자 역할 확인 중 ...");
        if (email.equals("admin@example.com")) {
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(email, password);
    }
}
