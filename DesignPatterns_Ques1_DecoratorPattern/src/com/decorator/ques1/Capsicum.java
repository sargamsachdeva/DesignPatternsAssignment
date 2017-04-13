package com.decorator.ques1;

public class Capsicum extends ToppingsDecorator {

    public Capsicum(Pizza pizza) {

        this.pizza = pizza;
    }
    @Override
    public int printCost() {

        return pizza.printCost() + 80;
    }

    @Override
    public String preparePizza() {

        return pizza.preparePizza() + "with topping Capsicum ";
    }
}
