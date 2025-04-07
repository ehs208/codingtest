import java.util.*;
class Solution {
    public int solution(int x, int y, int n) {
        int answer = -1;
        
        Queue<int[]> q = new LinkedList<>();
        boolean[] isVisited = new boolean[y+1];
        
        q.offer(new int[]{x, 0});
        
        while(!q.isEmpty()) {
            int[] numAndCount = q.poll();
            int num = numAndCount[0];
            int count = numAndCount[1];
            
            if(num == y) {
                answer = count;
                break;
            }
            
            if(num + n <= y) {
                if(!isVisited[num + n]) {
                q.offer(new int[]{num + n, count+1});
                isVisited[num + n] = true;
                }
            }
            if(num * 2 <= y) {
                if(!isVisited[num*2]) {
                q.offer(new int[]{num * 2, count+1});
                isVisited[num * 2] = true;
                }
            }
            if(num * 3 <= y) {
                if(!isVisited[num*3]) {
                q.offer(new int[]{num * 3, count+1});
                isVisited[num * 3] = true;
            }
            }
        }
        
        return answer;
    }
}