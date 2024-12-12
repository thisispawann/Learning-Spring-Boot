package com.thisispawann.springexample.loose.coupling;

public class UserManager {
//    UserManager is tightly coupled with UserDatabase
    private UserDataProvider userDataProvider;

    public UserManager(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    public String getUserInfo() {

        return userDataProvider.getUserDetails();
    }
}
