package com.thisispawann.springexample.loose.coupling;

public class NewDatabaseProvider implements UserDataProvider{
    @Override
    public String getUserDetails() {
        return "New Database in action";
    }
}