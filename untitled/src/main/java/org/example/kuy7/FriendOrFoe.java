package org.example.kuy7;

import java.util.List;

public class FriendOrFoe {
    public static List<String> friend(List<String> x){
        // Your code here
        return x.stream().filter(n -> n.length() == 4).toList();
    }
}
