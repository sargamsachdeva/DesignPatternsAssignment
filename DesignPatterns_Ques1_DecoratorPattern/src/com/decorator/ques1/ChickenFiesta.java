package com.decorator.ques1;

public class ChickenFiesta extends Pizza {

    @Override
    public int printCost() {

        return 400;
    }

    @Override
    public String preparePizza() {

        return "Preparing Chicken Fiesta ";
    }
}
