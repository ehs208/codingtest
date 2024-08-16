import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        for(int i=0; i<=n; i++) {
            if(i % 2 == 1) {
                numbers.add(i);
            }
        }
        
        int[] answer = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
        answer[i] = numbers.get(i);
        }
        return answer;
    }
}