package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem7 {
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> answer = Collections.emptyList();

        userFriend(user , friends);
        return answer;
    }

    private static List<String> userFriend(String user, List<List<String>> friends) {
        List<String> result = new ArrayList<>();
        for(int i = 0; i < friends.size(); i++){
            String A = friends.get(i).get(0);
            String B = friends.get(i).get(1);
            if (A.equals(user)) {
                result.add(B);
            }

            else if (B.equals(user)){
                result.add(A);
            }
        }
        return result;
    }

}
