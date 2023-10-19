package com.example.reciclador;

public class Persona {
    int image;
    String nombre;
    String email;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Persona(int image, String nombre, String email) {
        this.image = image;
        this.nombre = nombre;
        this.email = email;
    }
}
