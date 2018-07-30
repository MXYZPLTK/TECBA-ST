package com.TECBA.puntosdeinteres.demo;

public class UserDefault {
    private String name;
    private String id;
    private String rol;
    private String password;

    public UserDefault(String name, String id, String rol, String password) {
        this.name = name;
        this.id = id;
        this.rol = rol;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
