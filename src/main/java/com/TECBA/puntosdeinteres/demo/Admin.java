package com.TECBA.puntosdeinteres.demo;

public class Admin {
    private String name;
    private String id;
    private String rol;

    public Admin(String name, String id, String rol) {
        this.name = name;
        this.id = id;
        this.rol = rol;
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


}
