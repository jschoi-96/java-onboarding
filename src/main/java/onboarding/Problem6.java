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

    private static boolean loopDuplicate(List<List<String>> forms) {
        for(int i = 0; i < forms.size(); i++){
            String nickname = forms.get(i).get(1);
            for(int j = i + 1; j < forms.size(); j++){
                String target = forms.get(j).get(1);

                if (isDuplicate(nickname , target)) {
                    return true;
                }
            }
        }
        return false;
    }
}
