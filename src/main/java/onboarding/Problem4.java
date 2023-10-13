package onboarding;

public class Problem4 {
    public static String solution(String word) {
        String answer = "";


        return reverseWord(word);
    }

    private static String reverseWord(String word){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < word.length(); i++){
            char letter = word.charAt(i);
            if (Character.isUpperCase(letter)) {
                char reversedUpper = (char) ('Z' - (letter - 'A'));
                result.append(reversedUpper);
            }

            else if (Character.isLowerCase(letter)){
                char reversedLower = (char)('z' - (letter - 'a'));
                result.append(reversedLower);
            }

            else {
                result.append(" ");
            }
        }
        return result.toString();
    }

    private static boolean validateInput(String word) {
        if (word.length() < 1 || word.length() > 1000){
            return true;
        }
        return false;
    }
}
