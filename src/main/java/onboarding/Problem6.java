package onboarding;

import java.util.List;

public class Problem6 {
    public static List<String> solution(List<List<String>> forms) {
        List<String> answer = List.of("answer");
        return answer;
    }

    private static boolean isDuplicate(String nickname, String target) {
        for(int i = 1; i < nickname.length(); i++){
            String compare = nickname.substring(i-1, i+1);
            if (compare.contains(target)){
                return true;
            }
        }
        return false;
    }
}
