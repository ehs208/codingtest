import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        long left = 1;
        long right = (long)times[times.length-1] * n;
        long answer = 0;
        
        while(left <= right) {
            long process = 0;
            long mid = (left + right) / 2;
            
            for(int time: times) {
                process += mid / time;
            }
            
            if(process >= n) {
                answer = mid;
                right = mid - 1;
            }
            
            if(process < n) left = mid + 1;
        }
        
        return answer;
    }
    }
