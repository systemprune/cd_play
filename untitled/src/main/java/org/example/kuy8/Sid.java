package org.example.kuy8;

public class Sid {
    public static String howMuchILoveYou(int nb_petals) {
        String[] answers = new String[]{
                "I love you"
                , "a little"
                , "a lot"
                , "passionately"
                , "madly"
                , "not at all"
        };

        //your code here :)
        return answers[(nb_petals - 1) % 6];
    }
}
