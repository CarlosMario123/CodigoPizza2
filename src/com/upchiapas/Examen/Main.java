package com.upchiapas.Examen;


import com.upchiapas.Examen.Models.Cliente;
import com.upchiapas.Examen.Models.PizzaCatalogo;
import com.upchiapas.Examen.Models.Tienda;

import java.util.Scanner;

public class Main {
     static Tienda tienda = new Tienda();
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("********************************");
            System.out.println("        Pizzeria");
            System.out.println("********************************");
            System.out.println("1) ordenar");
            System.out.println("2)Mostrar los pedidos realizados");
            System.out.println("3)Salir");
            System.out.println("********************************");
            System.out.println("Opcion: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                       TomarPedido();
                    break;
                case 2:
                    MostrarPedidos();
                    break;
                default:
                    System.out.println("Hasta luego");
            }
        }while (opcion != 3);

    }


    public static void TomarPedido(){
        String name;
        byte opcion;
        System.out.println("aca1");
        String listaPizzas[] =  tienda.MostrarNombreDepizza();
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        name = entrada.nextLine();
        System.out.println("Ingrese su numero de telefono");
        Cliente cliente = new Cliente(name, entrada.nextInt());
        do {
            for(int i = 0;i < listaPizzas.length;i++ ){
                System.out.println((i+1) + ")"+listaPizzas[i]);
            }
            System.out.println((listaPizzas.length + 1) + ")Ya no quiero nada");
            opcion = entrada.nextByte();
        }while(opcion < 1 || opcion > 6);

        if(opcion != 6) {
            do {
                System.out.println("ingrese la cantidad");
                tienda.setCantidad(entrada.nextByte());
            } while (tienda.getCantidad() < 0);

            if (tienda.getCantidad() != 0) {
                tienda.TomarPedido(opcion, cliente);
                tienda.RegistrosDePedido(tienda.SendPedido());
                System.out.println("                  Pedido " + tienda.getPedidos().size());
                System.out.println("**********************************************************");
                System.out.println("cliente: " + tienda.SendPedido().getCliente().getNombrecliente());
                System.out.println("Numero de telefono: " + tienda.SendPedido().getCliente().getTelefono());
                System.out.println("Pizza: " + tienda.SendPedido().MandarPizza().getNombre());
                System.out.println("Cantidad: " + tienda.SendPedido().MandarPizza().getCantidad());
                System.out.println("Precio: " + tienda.SendPedido().MandarPizza().getPrecio());
                System.out.println("***********************************************************");
            }
        }
    }

    public static void MostrarPedidos(){

        for(int i = 0; i < tienda.getPedidos().size(); i++){
            System.out.println("                  Pedido " + (i+1));
            System.out.println("**********************************************************");
            System.out.println("cliente: " + tienda.getPedidos().get(i).getCliente().getNombrecliente());
            System.out.println("Numero de telefono: " + tienda.getPedidos().get(i).getCliente().getTelefono());
            System.out.println("Pizza: " + tienda.getPedidos().get(i).MandarPizza().getNombre());
            System.out.println("Cantidad: " + tienda.getPedidos().get(i).MandarPizza().getCantidad());
            System.out.println("Precio: " + tienda.getPedidos().get(i).MandarPizza().getPrecio());
            System.out.println("***********************************************************");
        }
    }

}