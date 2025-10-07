package com.tight.coupling;

public class UserDatabase {
    public String getUseDetails(){
        //Directly access DataBase here
        return "User Details From Database";
    }
}
