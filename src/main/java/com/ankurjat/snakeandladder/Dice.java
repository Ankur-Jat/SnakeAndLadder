package com.ankurjat.snakeandladder;

import java.util.Random;

public class Dice {
    private static Random rand = new Random();

    int getRoll() {
        return 1 + rand.nextInt(6);
    }
}
