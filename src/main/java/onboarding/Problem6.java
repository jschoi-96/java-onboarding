package onboarding;

import java.util.*;

public class Problem6 {
    public static List<String> solution(List<List<String>> forms) {
        List<String> answer = List.of("answer");
        HashSet<String> result = new HashSet<>();

        for(int i = 0; i < forms.size(); i++){
            for(int j = i + 1; j < forms.size(); j++){
                result.addAll(addDuplicate(forms.get(i), forms.get(j)));
            }
        }
        answer = List.copyOf(result);

        return answer;
    }

    private static boolean isDuplicate(String nickname, String target) {
        for(int i = 1; i < nickname.length(); i++){
            String compare = nickname.substring(i-1, i+1);
            if (target.contains(compare)){
                return true;
            }
        }
        return false;
    }

    private static Set<String> addDuplicate(List<String> crew, List<String> compareCrew) {
        Set<String> result = new HashSet<>();
        String nickname = crew.get(1);
        String target = compareCrew.get(1);
        if (isDuplicate(nickname,target)) {
            result.add(crew.get(0));
            result.add(compareCrew.get(0));
        }
        return result;
    }


}
