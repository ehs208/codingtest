import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
   
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++) {
            list.add(arr[i]);
        }
        
        int num = list.size();
        
        while (num > 1) {
            if(num%2 != 0) {
                list.add(0);
                num = list.size();
            }
            num = num / 2;
        }
        
        int answer[] = new int[list.size()];
        for(int j=0; j<list.size(); j++) {
            answer[j] = list.get(j);
        }
        return answer;
    }
}