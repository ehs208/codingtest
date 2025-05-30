import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        
        
        Arrays.sort(routes, (o1, o2) -> o1[1] - o2[1]);
        System.out.println(Arrays.deepToString(routes));
        
        int max = routes[0][1];
        int answer = 1;
        
        for(int i=0; i<routes.length; i++) {
            if(routes[i][0] > max) {
                max = routes[i][1];
                answer++;
        }
        }
        
        return answer;
    }
}