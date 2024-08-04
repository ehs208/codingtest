import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int k=0; k<arr.length; k++) {
            list.add(arr[k]);
        }
       
        
        for(int i=0; i<delete_list.length; i++) {
            list.remove(Integer.valueOf(delete_list[i]));
        }
        
        int answer[] = new int[list.size()];
        for(int j=0; j<list.size();j++) {
            answer[j] = list.get(j);
        }
        return answer;
    }
}