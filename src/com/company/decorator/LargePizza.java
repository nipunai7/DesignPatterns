package com.company.decorator;

public class LargePizza extends Pizza{

    LargePizza(){
        this.description = "Large Pizza";
    }

    @Override
    public double getCost(){
        return 1500;
    }
}
