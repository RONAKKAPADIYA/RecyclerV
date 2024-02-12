package com.example.appone;

public class item_model {

    String uname;
    String email;
    int user_img;

    public item_model(String uname, String email, int user_img) {
        this.uname = uname;
        this.email = email;
        this.user_img = user_img;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUser_img() {
        return user_img;
    }

    public void setUser_img(int user_img) {
        this.user_img = user_img;
    }
}
