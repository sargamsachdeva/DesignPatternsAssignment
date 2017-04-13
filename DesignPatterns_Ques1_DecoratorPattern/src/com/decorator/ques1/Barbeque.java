package com.decorator.ques1;

public class Barbeque extends ToppingsDecorator {

    public Barbeque(Pizza pizza) {

        this.pizza = pizza;
    }
    @Override
    public int printCost() {

        return pizza.printCost() + 200;
    }

    @Override
    public String preparePizza() {

        return pizza.preparePizza() + "with topping barbeque ";
    }
}
