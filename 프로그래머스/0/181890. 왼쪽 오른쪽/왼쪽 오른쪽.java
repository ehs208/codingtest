import java.util.Arrays;

class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        String temp = "";
        int k = 0;
        
        for(int i=0; i<str_list.length; i++) {
            temp = str_list[i];
            if(temp.equals("l") || temp.equals("r")) {
                k = i;
                break;
            }
        }
        
        if(temp.equals("l")) {
            answer = Arrays.copyOfRange(str_list, 0, k);
        }
        else if(temp.equals("r")) {
            answer = Arrays.copyOfRange(str_list, k+1, str_list.length);
        }
        
        
        return answer;
    }
}