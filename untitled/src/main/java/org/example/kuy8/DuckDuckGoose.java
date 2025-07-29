package org.example.kuy8;

public class DuckDuckGoose {
    public static String duckDuckGoose(Player[] players, int goose) {
        // Note: Player objects have a String field called 'name'.
        int namePosition = (goose - 1) % players.length;
        return players[namePosition].name;
    }
}

class Player {
    String name;

    public Player(String name) {
        this.name = name;
    }
}
