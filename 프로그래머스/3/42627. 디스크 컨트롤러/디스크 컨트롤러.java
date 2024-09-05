import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        int time = 0;
        
        PriorityQueue<int[]> pq1 = new PriorityQueue<>((a, b) -> a[0] - b[0]); // 모든 큐
        PriorityQueue<int[]> pq2 = new PriorityQueue<>((a, b) -> a[1] - b[1]); // 작업 가능한 큐
        
        for(int i=0; i<jobs.length; i++) {
            pq1.offer(jobs[i]);
        }
        
        while(!pq1.isEmpty() || !pq2.isEmpty()) {
            while(!pq1.isEmpty() && pq1.peek()[0] <= time) {
                pq2.offer(pq1.poll());
            }
        if(!pq2.isEmpty()) {
                int[] currentJob = pq2.poll();
                time += currentJob[1];
                answer += time - currentJob[0];
            } else {
                time = pq1.peek()[0];
            }
        }
        
        return answer / jobs.length;
    }
}