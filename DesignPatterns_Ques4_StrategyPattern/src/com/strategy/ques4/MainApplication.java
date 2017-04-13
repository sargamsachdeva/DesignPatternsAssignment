package com.strategy.ques4;

public class MainApplication {

    public static void main(String[] args) {

        JumpBehavior highJump = new HighJump();
        JumpBehavior longJump = new LongJump();

        RollBehavior backwardRoll = new BackwardRoll();
        RollBehavior forwardRoll = new ForwardRoll();

        StreetFighter fighterLeo = new LeoFighter(highJump,backwardRoll);
        System.out.println("For Leo==========>>>>>>   ");
        fighterLeo.roll();
        fighterLeo.jump();
        fighterLeo.kick();

        StreetFighter fighterPaul = new PaulFighter(longJump,forwardRoll);
        System.out.println("For Paul==========>>>>>>>   ");
        fighterPaul.roll();
        fighterPaul.jump();
        fighterPaul.punch();
    }
}
