package com.observer.ques2;


class CurrentScoreDisplay implements Observer
{
    private int runs, wickets;
    private float overs;

    public void update(int runs, float overs, int wickets)
    {
        this.runs = runs;
        this.overs = overs;
        this.wickets = wickets;
        display();
    }

    public void display()
    {
        System.out.println("\nCurrent Score Display:" + "\n Runs: " + runs + "\n Overs: " + overs
                +"\n Wickets:" + wickets );
    }
}
