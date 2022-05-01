package com.edu.cesde;

public class Cliente extends Persona {
    private String celular;
    private String direccion;

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", celular='" + celular + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
