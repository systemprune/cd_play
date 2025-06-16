package org.example.kuy8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class GiftSorter {
    public String sortGiftCode(String code){
        //Put code here!
        return Arrays.stream(code.split("")).sorted().collect(Collectors.joining());
    }
}
