package com.upchiapas.Examen.Models;

import java.util.LinkedList;

public class PizzaCatalogo {
    private LinkedList <Pizza> pizzas = new LinkedList<Pizza>();
    public PizzaCatalogo(){
    }

    private void LlenarPizzas(){
        Pizza pizza;
        pizzas.add(pizza = new Pizza("Pizza Baconara",250));
        pizzas.add(pizza = new Pizza("Pizza hawayana",250));
        pizzas.add(pizza = new Pizza("Pizza peperoni",230));
        pizzas.add(pizza = new Pizza("Pizza Mexicana",230));
        pizzas.add(pizza = new Pizza("PizzaC hampiñones",230));
    }

    public LinkedList<Pizza> getPizzas(){
        LlenarPizzas();
        return pizzas;
    }
}
