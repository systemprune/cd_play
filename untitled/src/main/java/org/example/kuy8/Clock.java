package org.example.kuy8;

import java.time.Duration;

public class Clock {
    public static int Past(int h, int m, int s) {
        //Happy Coding! ^_^
//        return h * 3600000 + m * 60000 + s * 1000;
        return (int) Duration.ofHours(h).plusMinutes(m).plusSeconds(s).toMillis();
    }
}
