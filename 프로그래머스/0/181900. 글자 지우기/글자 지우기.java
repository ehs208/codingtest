import java.util.*;

class Solution {
 public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] strArr = my_string.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(strArr));
        
        Arrays.sort(indices);
        
        for (int i=indices.length-1; i>=0; i--) {
            list.remove(indices[i]);
        }
        
        for (int j=0; j<list.size(); j++) {
            answer=answer+list.get(j);
        }
        return answer;
    }
}