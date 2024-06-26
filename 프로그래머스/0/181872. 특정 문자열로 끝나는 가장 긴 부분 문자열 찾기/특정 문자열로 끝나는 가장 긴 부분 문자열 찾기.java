class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        
        int i = myString.lastIndexOf(pat);
        
        for(int j = 0; j<i+(pat.length()); j++) {
            answer = answer + myString.charAt(j);
        }
        return answer;
    }
}