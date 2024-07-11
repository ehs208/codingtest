import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String temp = myStr.replace("b", "a");
        temp = temp.replace("c","a");
        String[] answer = temp.split("a");
        
        ArrayList<String> strArrList = new ArrayList<>(Arrays.asList(answer)); 
        
        for (int i = 0; i < strArrList.size(); i++) {
            if (strArrList.get(i).equals("")) {
                strArrList.remove(i);
                i--; 
            }
        }
        answer = new String[strArrList.size()];
        strArrList.toArray(answer); 
        
        if(strArrList.size() == 0)
             return new String[]{"EMPTY"};
        
        return answer;
    }
}