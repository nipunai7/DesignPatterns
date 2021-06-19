package com.company.decorator;

public class extraCheese  extends decoPattern{
    extraCheese(Pizza p){
        this.pizza = p;
    }

    public double getCost(){
        return pizza.getCost() + 200;
    }
}
