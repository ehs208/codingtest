import java.util.*;

class Solution {
    public int[] solution(int target) {
        int[] answer = new int[2];

        // dp[i][0]: i점을 만들기 위한 최소 다트 수
        // dp[i][1]: 그 경우 싱글/불 개수
        int[][] dp = new int[target + 1][2];

        for (int i = 1; i <= target; i++) {
            dp[i][0] = Integer.MAX_VALUE;
            dp[i][1] = 0;
        }

        // 만들 수 있는 점수 모음
        Set<Integer> scores = new HashSet<>();

        for (int i = 1; i <= 20; i++) {
            scores.add(i);       // 싱글
            scores.add(i * 2);   // 더블
            scores.add(i * 3);   // 트리플
        }
        scores.add(50); // 불

        for (int i = 1; i <= target; i++) {
            for (int score : scores) {
                if (i - score < 0) continue;

                int prevCount = dp[i - score][0] + 1;
                int prevSingleBull = dp[i - score][1] + ((score <= 20 || score == 50) ? 1 : 0);

                if (prevCount < dp[i][0]) {
                    dp[i][0] = prevCount;
                    dp[i][1] = prevSingleBull;
                } else if (prevCount == dp[i][0] && prevSingleBull > dp[i][1]) {
                    dp[i][1] = prevSingleBull;
                }
            }
        }

        answer[0] = dp[target][0]; // 최소 던진 횟수
        answer[1] = dp[target][1]; // 싱글 or 불 개수

        return answer;
    }
}