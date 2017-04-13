package com.decorator.ques1;

public class Paneer extends ToppingsDecorator {

    public Paneer(Pizza pizza) {

        this.pizza = pizza;
    }
    @Override
    public int printCost() {

        return pizza.printCost() + 150;
    }

    @Override
    public String preparePizza() {

        return pizza.preparePizza() + "with topping Paneer ";
    }
}
