package onboarding;

public class Problem3 {
    public static int solution(int number) {
        int answer = 0;
        for(int i = 0; i <= number; i++){
            answer += containsValue(i);
        }
        return answer;
    }

    public static int containsValue(int number) {
        String numberString = String.valueOf(number);
        int result = 0;
        for(int i = 0; i < numberString.length(); i++){
            char letter = numberString.charAt(i);
            int isClap = Character.getNumericValue(letter);
            if (isClap == 3 || isClap == 6 || isClap == 9) {
                result++;
            }
        }
        return result;
    }
}
