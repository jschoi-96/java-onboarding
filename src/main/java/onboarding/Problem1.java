package onboarding;

import java.util.List;

class Problem1 {


    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;

        int largestPobiNumber = 0;
        int largetCrongNumber = 0;
        if (validatePage(pobi) || validatePage(crong)) {
            answer = -1;
            return answer;
        }

        for (Integer pobiPage : pobi) {
            largestPobiNumber = returnLargeNum(addEachPage(pobiPage), multiplyEachPage(pobiPage));
        }

        for (Integer crongPage : crong) {
            largetCrongNumber = returnLargeNum(addEachPage(crongPage), multiplyEachPage(crongPage));
        }



    }

    private static int addEachPage(int page){
        int addSum = 0;
        while (page > 0) {
            int eachNum = page / 10;
            addSum += eachNum;
            page /= 10;
        }
        return addSum;
    }

    private static int multiplyEachPage(int page){
        int multiplySum = 1;
        while (page > 0) {
            int eachNum = page / 10;
            multiplySum *= eachNum;
            page /= 10;
        }
        return multiplySum;
    }

    private static int returnLargeNum(int addSum, int multiplySum) {
        int result = multiplySum;
        if (addSum > multiplySum) {
            result = addSum;
        }
        return result;
    }

    private static boolean validatePage(List<Integer>person) {
        int leftPage = person.get(0);
        int rightPage = person.get(1);
        if (leftPage < 1 || rightPage > 400) {
            return false;
        }
        if (rightPage <= leftPage) {
            return false;
        }
        if (rightPage - leftPage != 1) {
            return false;
        }
        return true;
    }
}
