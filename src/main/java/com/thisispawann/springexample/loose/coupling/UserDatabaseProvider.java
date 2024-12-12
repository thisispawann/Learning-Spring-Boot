package com.thisispawann.springexample.loose.coupling;

public class UserDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        return "User Details From Database";
    }
}
