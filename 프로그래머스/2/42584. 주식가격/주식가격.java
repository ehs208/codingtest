import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        Stack<Integer[]> stack = new Stack<>();
        int[] answer = new int[prices.length];

        for (int i = prices.length - 2; i >= 0; i--) {
            int time = 0;
            while (!stack.isEmpty() && stack.peek()[0] >= prices[i]) {
                time += stack.pop()[1];
            }
            answer[i] = stack.push(new Integer[]{prices[i], time + 1})[1];
        }

        return answer;
    }
}
