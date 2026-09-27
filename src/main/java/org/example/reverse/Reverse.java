package org.example.reverse;

public class Reverse {

    public String reverse(String str) {
        if (str == null) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
