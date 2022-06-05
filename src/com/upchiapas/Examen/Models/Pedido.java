package com.upchiapas.Examen.Models;

public class Pedido {

    private Cliente cliente;
    private byte opcion;
    private byte cantidad;
    public Pedido(Cliente cliente, byte opcion,byte cantidad) {
        this.cliente = cliente;
        this.opcion = opcion;
        this.cantidad = cantidad;
    }


    private Pizza RecibirPedidoPizza(){
        Pizza pizza1 = new Pizza();
        return pizza1.SendPizza(opcion);
    }
    public Pizza MandarPizza(){
        Pizza pizza = RecibirPedidoPizza();
        pizza.setCantidad(cantidad);
        return pizza;
    }
    public Cliente getCliente(){
        return cliente;
    }
}
