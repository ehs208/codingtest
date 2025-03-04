import java.util.*;
class Solution {
    public int solution(String name) {
        int answer = 0;
        int length = name.length();
        
        for(int i=0; i<length; i++) {
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);
        }
        
        int minMove = length - 1;
        
        for(int i=0; i<length; i++) {
            int next = i + 1;
            while(next < length && name.charAt(next) == 'A') {
                next++;
            }
            
            // 현재 위치까지 왔다가 다시 돌아가는 경우와 
            // 처음부터 뒤로 가서 거꾸로 오는 경우 비교
            int move = i + length - next + Math.min(i, length - next);
            minMove = Math.min(minMove, move);
        }
        
        answer += minMove;
        return answer;
    }
}