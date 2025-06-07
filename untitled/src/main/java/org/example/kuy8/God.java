package org.example.kuy8;

public class God {
    public static Human[] create() {
        //code
        return new Human[]{new Man(), new Woman()};
    }
}

abstract class Human {}
class Man extends Human{}
class Woman extends Human{}