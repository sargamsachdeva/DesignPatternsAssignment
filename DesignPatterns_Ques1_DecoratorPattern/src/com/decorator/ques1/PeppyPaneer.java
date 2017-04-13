package com.decorator.ques1;

public class PeppyPaneer extends Pizza {

    @Override
    public int printCost() {

        return 450;
    }

    @Override
    public String preparePizza() {

        return " Preparing Peppy Paneer ";
    }
}
