package onboarding;

public class Problem2 {
    public static String solution(String cryptogram) {
        String answer = "answer";

        if (!validateInput(cryptogram)) {
            answer = "올바른 입력값이 아닙니다.";
        }
        return answer;
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
