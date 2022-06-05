package com.upchiapas.Examen.Models;

public class Cliente {
    private String nombrecliente;
    private int telefono;
    public Cliente(String nombrecliente,int telefono) {
        this.telefono = telefono;
        this.nombrecliente = nombrecliente;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }
    public int getTelefono() {
        return telefono;
    }
}
