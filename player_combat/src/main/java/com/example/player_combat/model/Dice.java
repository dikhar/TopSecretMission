package com.example.player_combat.model;


import java.util.Random;


public class Dice {
    public Random random = new Random();

    public int getRandom() {
        return random.nextInt(6) + 1;
    }
}
