import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<queries.length; i++) {
            for(int j=queries[i][0]; j<=queries[i][1]; j++) {
                if(j %  queries[i][2] == 0) {
                    arr[j] = arr[j] + 1;
                }
            }
        }


        return arr;
    }
    
}