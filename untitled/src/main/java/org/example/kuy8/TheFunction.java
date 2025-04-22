package org.example.kuy8;

public class TheFunction {
    public static void _if(Boolean bool, Runnable func1, Runnable func2) {
        if(Boolean.TRUE.equals(bool)){
            func1.run();
        }else {
            func2.run();
        }
        // ...
    }
}
