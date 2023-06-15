package com.example.canwe;

public class Model_User {


    private String userid,username,password,emailaddress,isactive;

    public Model_User (String username, String password, String emailaddress, String isactive) {


        this.username = username;
        this.password = password;
        this.emailaddress = emailaddress;
        this.isactive = isactive;
    }



    public Model_User () {
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive;
    }

    public String getUserid() {
        return userid;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public String getIsactive() {
        return isactive;
    }
}