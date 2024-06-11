import java.util.ArrayList;

class Solution {
    public int solution(String my_string, String is_suffix) {
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<my_string.length(); i++) {
            list.add(my_string.substring(0,i));
        }
        
        for(int j=0; j<list.size(); j++) {
            if(list.get(j).equals(is_suffix)) {
                return 1;
            }
        }
        return 0;
    }
}

