package com.singleton.ques3;

public class MainApplication {

    public static void main(String[] args) {

            Thread t = new Thread(()->FileReaderApp.readFile());
            t.start();

            Thread t1 = new Thread(()->FileReaderApp.appendToFile("New data added by Thread t1"));
            t1.start();

            Thread t2 = new Thread(()->FileReaderApp.appendToFile("New data added by Thread t2"));
            t2.start();

        }

    }

