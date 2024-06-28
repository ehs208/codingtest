import java.util.*;

class Solution {
    public String[] solution(String myString) {
        ArrayList<String> temp = new ArrayList<>();
        String list[] = myString.split("x");
        
        for(int i=0; i<list.length; i++) {
            if(!list[i].equals("")) {
                temp.add(list[i]);
            }
        }
        String[] answer = temp.toArray(new String[0]);
        Arrays.sort(answer);
        return answer;
    }
}