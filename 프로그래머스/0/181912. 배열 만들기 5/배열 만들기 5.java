import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(String[] intStrs, int k, int s, int l) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> answer = new ArrayList<>();
        String temp = "";
        
        
        
        for(int i=0; i<intStrs.length; i++) {
            temp = intStrs[i];
            sb = new StringBuilder();
            for(int j=s; j<s+l; j++) {
                sb.append(temp.charAt(j));
            }
            if(Integer.parseInt(sb.toString())>k) {
                answer.add(Integer.parseInt(sb.toString()));
            }
        }
        return answer;
    }
}