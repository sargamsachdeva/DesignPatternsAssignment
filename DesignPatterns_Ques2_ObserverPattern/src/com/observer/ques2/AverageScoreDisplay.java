package com.observer.ques2;

class AverageScoreDisplay implements Observer
{
    private float runRate;
    private int averageScore;

    public void update(int runs ,float overs , int wickets)
    {
        this.runRate =(float)runs/overs;
        this.averageScore = (int)(this.runRate * 50);
        display();
    }

    public void display()
    {
        System.out.println("\nAverage Score Display: \n" + "Run Rate is: " + runRate
                + "     Average Score is: " + averageScore);
    }
}
