import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<picture.length; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<picture[i].length(); j++) {
                if(picture[i].charAt(j) == 'x') {
                    sb.append(extendstr("x", k));
                }
                else if (picture[i].charAt(j) == '.') {
                    sb.append(extendstr(".", k));
                }
            }
            
            for(int m=0; m<k; m++) {
            list.add(sb.toString());
            }
        }
        System.out.println(list);
         answer = list.toArray(answer);
          return answer;
    }
  
    
    public static String extendstr(String m, int o) {
        StringBuilder extendedstr = new StringBuilder();
        for (int l = 0; l < o; l++) {
            extendedstr.append(m);
        }
        return extendedstr.toString();
    }
}
