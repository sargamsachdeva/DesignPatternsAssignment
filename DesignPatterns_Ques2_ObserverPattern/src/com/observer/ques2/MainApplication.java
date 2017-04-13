package com.observer.ques2;

public class MainApplication {

    public static void main(String[] args) {

        CricketData cricketData = new CricketData();
        AverageScoreDisplay averageScoreDisplay =new AverageScoreDisplay();
        CurrentScoreDisplay currentScoreDisplay = new CurrentScoreDisplay();

        cricketData.attachObservers(averageScoreDisplay);
        cricketData.attachObservers(currentScoreDisplay);

        cricketData.getLatestData();

        cricketData.detachObservers(currentScoreDisplay);
        cricketData.getLatestData();
    }
}
