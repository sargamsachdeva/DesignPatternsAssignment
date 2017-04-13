package com.decorator.ques1;

public class FarmHouse extends Pizza {

    @Override
    public int printCost() {

        return 600;
    }

    @Override
    public String preparePizza() {

        return "Preparing FarmHouse ";
    }
}
