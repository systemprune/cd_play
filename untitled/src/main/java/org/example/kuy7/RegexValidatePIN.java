package org.example.kuy7;

import java.util.regex.Pattern;

public class RegexValidatePIN {

    public static boolean validatePin(String pin) {
        // Your code here...
        return Pattern.matches("^(\\d{4}|\\d{6})$", pin);
    }
}
