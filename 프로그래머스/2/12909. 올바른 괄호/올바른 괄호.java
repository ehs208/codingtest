import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Queue<String> queue = new LinkedList<>();
        int num = 0;
        
        for(int i=0; i<s.length(); i++) {
            queue.offer("" + s.charAt(i));
        }
        
        while(!queue.isEmpty() && num >= 0) {
            if(queue.peek().equals("(")) {
                queue.poll();
                num++;
            }
            else {
                queue.poll();
                num--;
        }
        }
        return num == 0 ? true : false;
    }
}