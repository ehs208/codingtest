import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> list = new ArrayList<>();
        String[] answer = {};
        
        for(int i=0; i<my_string.length(); i++) {
            list.add(my_string.substring(i));
        }
        list.sort(null);
        
        answer = list.toArray(answer);
        
        return answer;
    }
}