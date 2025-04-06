import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
       
        for(int i=0; i<works.length; i++) {
            q.offer(works[i]);
        }
        
        for(int i=0; i<n; i++) {
            if(q.isEmpty()) break;
            
            int newNum = q.poll() -1;
            if(newNum > 0)
            {
                q.offer(newNum);
            }
            
        }
        
        while(!q.isEmpty()) {
            int num = q.poll();
            answer += num * num;
        }
        
        
        return answer;
    }
}