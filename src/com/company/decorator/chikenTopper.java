package com.company.decorator;

public class chikenTopper extends decoPattern{

    chikenTopper(Pizza p){
        this.pizza = p;
    }

    public double getCost(){
        return pizza.getCost() + 400;
    }
}
