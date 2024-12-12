package com.thisispawann.springexample.tight.coupling;

public class TightCoupingExample {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        System.out.println(userManager.getUserInfo());
    }
}
