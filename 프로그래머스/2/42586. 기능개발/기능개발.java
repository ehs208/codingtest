import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int day = 1;
        int k = 0;
        int time = speeds[0];
        int count=0;
        
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=0; i<progresses.length; i++) {
            queue.add(progresses[i]);
        }
        
        while(!queue.isEmpty()) {
            
        if(queue.element() + day * time  >= 100) {
            queue.remove();
            k++;
            count++;
            if (k < speeds.length) {
                time = speeds[k];
        }
        }
        else {
            if(count != 0) {
            list.add(count);
            count = 0;
            }
            day++;
        }
            
        }
         if (count != 0) {
            list.add(count);
        }
        answer = new int[list.size()];
        for(int j=0; j<list.size(); j++) {
            answer[j] = list.get(j);
        }
        return answer;
}
}