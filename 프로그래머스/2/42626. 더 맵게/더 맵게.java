import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<scoville.length; i++) {
            pq.offer(scoville[i]);
        }
        
        while(pq.peek() < K) {
                if(pq.size() < 2) {
                    answer = -1;
                    break;
                }
            int min = pq.poll();
            int max = pq.poll();
            pq.offer(min + max * 2);
            answer++;
            
        }
        
        return answer;
    }
}