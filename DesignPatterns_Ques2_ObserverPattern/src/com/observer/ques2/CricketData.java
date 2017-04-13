package com.observer.ques2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CricketData implements Subject {

    int runs;
    float overs;
    int wickets;
    List<Observer> observersList;

    public CricketData() {

        observersList = new ArrayList<Observer>();
    }

    @Override
    public void attachObservers(Observer observer) {

        observersList.add(observer);
    }

    @Override
    public void notifyObservers() {

        Iterator iterator = observersList.iterator();

        while (iterator.hasNext()) {
            Observer observer = (Observer) iterator.next();
            observer.update(runs,overs,wickets);

        }
    }

    @Override
    public void detachObservers(Observer observer) {

        observersList.remove(observer);

    }

    private int getUpdatedRuns()
    {
        return 150;
    }

     private int getUpdatedWickets()
    {
        return 4;
    }

    private float getUpdatedOvers()
    {
        return (float) 15.5;
    }

    public void getLatestData()
    {
        runs = getUpdatedRuns();
        overs = getUpdatedOvers();
        wickets = getUpdatedWickets();

        notifyObservers();
    }
}
