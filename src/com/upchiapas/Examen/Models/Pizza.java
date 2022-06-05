package com.upchiapas.Examen.Models;

import java.util.LinkedList;

public class Pizza {
    private String nombre;
    private int precio;
    private byte cantidad;
    public  Pizza(String nombres, int precios){
        this.nombre=nombres;
        this.precio=precios;
    }
    public Pizza(){
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public Pizza SendPizza(byte indice){
        LinkedList<Pizza> pizzas = new LinkedList<Pizza>();

        PizzaCatalogo Cpizzas = new PizzaCatalogo();
        pizzas = Cpizzas.getPizzas();
        return pizzas.get(indice - 1);
    }

    public void setCantidad(byte cantidad) {
        this.cantidad = cantidad;
    }

    public byte getCantidad() {
        return cantidad;
    }
}
