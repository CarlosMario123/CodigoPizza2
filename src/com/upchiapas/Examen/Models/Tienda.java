package com.upchiapas.Examen.Models;

import java.util.LinkedList;

public class Tienda {
    private Pedido pedido;
    private byte opcion;
    private Cliente cliente;
    private byte cantidad;
    private LinkedList<Pedido> pedidos = new LinkedList<Pedido>();

    public Tienda() {
    }
    public void TomarPedido(byte opcion,Cliente cliente){
        this.opcion = opcion;
        this.cliente = cliente;
    }
    public Pedido SendPedido(){
        return pedido = new Pedido(cliente,opcion,cantidad);
    }
    public void RegistrosDePedido(Pedido pedido){
        pedidos.add(pedido);
    }

    public LinkedList<Pedido> getPedidos(){
        return pedidos;
    }

    public String[] MostrarNombreDepizza(){
        PizzaCatalogo catalogo = new PizzaCatalogo();
         String nombres[] = new String[catalogo.getPizzas().size()];
        for(int i = 0; i < 5; i++){
            nombres[i] = catalogo.getPizzas().get(i).getNombre();

        }
        return nombres;
    }

    public byte getCantidad() {
        return cantidad;
    }

    public void setCantidad(byte cantidad) {
        this.cantidad = cantidad;
    }

}
