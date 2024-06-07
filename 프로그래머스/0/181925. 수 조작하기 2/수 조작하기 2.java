import java.util.ArrayList;
class Solution {
    public String solution(int[] numLog) {
      
        ArrayList<String> answer = new ArrayList<>();
        for(int i=1;i<numLog.length;i++) {
            if((numLog[i] - numLog[i-1]) == 1) {
                answer.add("w");
            }
            else if((numLog[i] - numLog[i-1]) == -1) {
                answer.add("s");
            }
            else if((numLog[i] - numLog[i-1]) == 10) {
                answer.add("d");
            }
            else if((numLog[i] - numLog[i-1]) == -10) {
                answer.add("a");
            }
        }
         String str = String.join("", answer);
        return str;
    }
}