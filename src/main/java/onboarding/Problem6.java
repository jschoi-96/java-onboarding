package onboarding;

import java.util.ArrayList;
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

    private static List<String> addDuplicate(List<String> crew, List<String> compareCrew) {
        List<String> result = new ArrayList<>();
        String nickname = crew.get(1);
        String target = compareCrew.get(1);
        if (isDuplicate(nickname,target)) {
            result.add(crew.get(0));
            result.add(crew.get(1));
        }
        return result;
    }


}
