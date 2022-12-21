package concurrency.RockPaperScissors;

import java.util.Random;

public class Player extends Thread {
    private static final String[] choices = {"rock", "paper", "scissors"};
    private Random random;
    private String choice;

    public Player() {
        this.random = new Random();
    }

    @Override
    public void run() {
        this.choice = choices[random.nextInt(3)];
    }

    public String getChoice() {
        return this.choice;
    }
}

