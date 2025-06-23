package org.example.kuy8;

public class PersonalizedMessage {
    static String greet(String name, String owner) {
        // Add code here
        return name.equals(owner) ? "Hello boss" : "Hello guest";
    }
}
