package com.company.decorator;

public class Main {

    public static void main(String[] args) {

        Pizza pizza = new LargePizza();
        double cost = pizza.getCost();

        System.out.println(pizza.description+": "+ cost);

    }
}
