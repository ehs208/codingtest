import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int[][] queries) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        int minValue = 0;
        
        for(int i=0; i<queries.length; i++) {
            list.clear();
            for(int j=queries[i][0]; j<=queries[i][1]; j++) {
                if(arr[j] > queries[i][2]) {
                    list.add(arr[j]);
                }
            }
            if(list.isEmpty()) {
            answer.add(-1);
            }
            else {
             minValue = Collections.min(list);
             answer.add(minValue);
            }
        }
        return answer;
    }
    
}