package com.thisispawann.springexample.loose.coupling;

public class UserManager {
//    UserManager is tightly coupled with UserDatabase
    private UserDatabase userDatabase = new UserDatabase();

    public String getUserInfo() {
        return userDatabase.getUserDetails();
    }
}
