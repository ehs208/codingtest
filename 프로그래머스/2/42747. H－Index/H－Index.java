import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int n = citations.length;
        int count = 0;
        
        Arrays.sort(citations);
        
        for(int i=0; i<n; i++) {
            count = 0;
            for(int j=i; j<n; j++) {
                if(citations[i] <= citations[j])
                    count++;
            }
            System.out.println(count);
            if(count < citations[i]){
                answer = count;
                break;
            }
        }
        
      
        
        return answer;
    }
}