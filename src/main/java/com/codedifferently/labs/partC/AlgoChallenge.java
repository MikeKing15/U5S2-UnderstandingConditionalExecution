package com.codedifferently.labs.partC;

public class AlgoChallenge {

    public static Boolean containE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }
        return count >= 1 && count <= 3;
    }

    public static String everyOther(String str, int n) {
        String result = "";
        for (int i = 0; i < str.length(); i += n) {
            result += str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(containE("Hello"));
        System.out.println(containE("Heelle"));
        System.out.println(containE("Heelele"));

        System.out.println(everyOther("Miracle", 2));
        System.out.println(everyOther("abcdefg", 2));
        System.out.println(everyOther("abcdefg", 3));
    }
}
