package org.example.kuy6;

public class EncryptThis {
    public static String encryptThis(String text) {
        // Implement me! :)
        StringBuilder sb = new StringBuilder();
        String[] strings = text.split(" ");

        for (String s : strings) {
            if (s.length() == 0) {
                sb.append(" ");
                continue;
            }

            sb.append((short) s.charAt(0));

            if (s.length() > 1) {
                sb.append(s.charAt(s.length() - 1));
                if (s.length() > 2) {
                    sb.append(s, 2, s.length() - 1);
                    sb.append(s.charAt(1));
                }
            }

            sb.append(" ");
        }

        return sb.toString().trim();
    }
}
