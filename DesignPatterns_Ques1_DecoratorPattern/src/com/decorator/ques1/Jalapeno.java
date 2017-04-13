package com.decorator.ques1;

public class Jalapeno extends ToppingsDecorator {

    public Jalapeno(Pizza pizza) {

        this.pizza = pizza;
    }
    @Override
    public int printCost() {

        return pizza.printCost() + 120;
    }

    @Override
    public String preparePizza() {

        return pizza.preparePizza() + "with topping Jalapeno ";
    }
}
