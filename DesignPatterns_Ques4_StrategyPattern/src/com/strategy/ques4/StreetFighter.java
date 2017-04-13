package com.strategy.ques4;

public abstract class StreetFighter {

    JumpBehavior jumpBehavior;
    RollBehavior rollBehavior;

    public StreetFighter(JumpBehavior jumpBehavior, RollBehavior rollBehavior) {
        this.jumpBehavior = jumpBehavior;
        this.rollBehavior = rollBehavior;
    }

    public void punch() {

        System.out.println("Punching....");
    }

    public void kick() {

        System.out.println("Kicking....");
    }

    public void jump() {

        jumpBehavior.jump();
    }

    public void roll() {

        rollBehavior.roll();
    }
}
