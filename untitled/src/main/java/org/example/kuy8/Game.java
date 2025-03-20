package org.example.kuy8;

public class Game {
    public static int combat(int health, int damage) {
        return Math.max(health - damage, 0);
    }
}
