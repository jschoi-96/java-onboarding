package onboarding;

public class Problem4 {
    public static String solution(String word) {
        String answer = "";

        if (validateInput(word)){
            return "입력값을 다시 입력해주십시오.";
        }
        return answer;
    }


    private static boolean validateInput(String word) {
        if (word.length() < 1 || word.length() > 1000){
            return true;
        }

        for(int i = 0; i < word.length(); i++){
            if (!Character.isAlphabetic(word.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
