package com.TECBA.puntosdeinteres.demo;

import java.util.ArrayList;

public class Admin extends Cuenta {
    String user;
    String account;


    public Admin(String name, int age, String email, String adress, int phone, String user, String account) {
        super(name, age, email, adress, phone);
        this.user = user;
        this.account = account;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}