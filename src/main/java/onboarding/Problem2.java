package onboarding;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Problem2 {
    public static String solution(String cryptogram) {
        String answer = "answer";

        if (!validateInput(cryptogram)) {
            return "올바른 입력값이 아닙니다.";
        }

    }



    private static boolean findConsecutiveDuplicate(StringBuilder cryptogram) {
        for (int i = 1; i < cryptogram.length(); i++){
            if (cryptogram.charAt(i-1) == cryptogram.charAt(i)){
                return true;
            }
        }
        return false;
    }

    private static StringBuilder deleteConsecutiveDuplicate(StringBuilder cryptogram) {
        for(int i = 1; i < cryptogram.length(); i++){
            if (cryptogram.charAt(i-1) == cryptogram.charAt(i)) {
                cryptogram.delete(i - 1, i+1);
            }
        }
        return cryptogram;
    }


    private static boolean validateInput(String cryptogram) {
        if (cryptogram.length() < 1 || cryptogram.length() > 1000) {
            return false;
        }

        for(int i = 0; i < cryptogram.length(); i++){
            char eachLetter = cryptogram.charAt(i);

            if (!Character.isAlphabetic(eachLetter)) {
                return false;
            }

            if (Character.isUpperCase(eachLetter)) {
                return false;
            }
        }
        return true;
    }
}
