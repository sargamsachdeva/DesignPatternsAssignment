package com.decorator.ques1;

public class FreshTomato extends ToppingsDecorator {

    public FreshTomato(Pizza pizza) {

        this.pizza = pizza;
    }
    @Override
    public int printCost() {

        return pizza.printCost() + 100;
    }

    @Override
    public String preparePizza() {

        return pizza.preparePizza() + "with topping fresh tomato ";
    }
}
