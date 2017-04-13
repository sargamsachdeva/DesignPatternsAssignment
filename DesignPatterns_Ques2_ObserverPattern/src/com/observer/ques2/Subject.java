package com.observer.ques2;


public interface Subject {

    public void attachObservers(Observer observer);
    public void notifyObservers();
    public void detachObservers(Observer observer);
}
