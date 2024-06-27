import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> temp = new ArrayList<>();
        for(int i=0; i<strArr.length; i++) {
            if(strArr[i].indexOf("ad") == -1) {
                temp.add(strArr[i]);
            }
        }
        String answer[] = new String[temp.size()];
        temp.toArray(answer);
        return answer;
    }
}