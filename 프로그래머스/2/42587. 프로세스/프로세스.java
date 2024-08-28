import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int count = 0;
        int numcount = priorities.length - 1;
        int check = priorities[location];
        
        Queue<Integer> queue = new LinkedList<>();
        
         for(int i=0; i<priorities.length; i++) {
            queue.offer(priorities[i]);
        }
        Arrays.sort(priorities);
        
        while(true) {
            int temp = queue.peek();
            if(temp == priorities[numcount]) {
                queue.poll();
                count++;
                numcount--;
                if(location == 0) break;
            }
            else {
                queue.poll();
                queue.offer(temp);
            }
            location = location - 1 >= 0 ? location - 1 : queue.size() - 1;
        }
        return count;
    }
}