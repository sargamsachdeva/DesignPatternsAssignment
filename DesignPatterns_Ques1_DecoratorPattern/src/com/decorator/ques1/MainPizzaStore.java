package com.decorator.ques1;

public class MainPizzaStore {

    public static void main(String[] args) {

        Pizza pizza = new Paneer(new Capsicum(new FarmHouse()));
        System.out.println("Your Pizza: " +pizza.preparePizza());
        System.out.println("Total Cost: " +pizza.printCost());

        Pizza pizza1 = new Barbeque(new Paneer(new ChickenFiesta()));
        System.out.println("Your Pizza: " +pizza1.preparePizza());
        System.out.println("Total Cost: " +pizza1.printCost());
    }
}
