import java.util.*;

class Solution {
    public int solution(int[] array) {
        int max = 0;
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<array.length; i++) {
            map.put(array[i], map.getOrDefault(array[i], 1)+1);
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            int key = entry.getKey();

            if (value > max) {
                answer = key;
                max = value;
            }
            else if(value == max) {
                answer = -1;
            }
        }
        
        return answer;
    }
}