package com.decorator.ques1;

public class Margherita extends Pizza {

    @Override
    public int printCost() {

        return 500;
    }

    @Override
    public String preparePizza() {

        return "Preparing Margherita ";
    }
}
