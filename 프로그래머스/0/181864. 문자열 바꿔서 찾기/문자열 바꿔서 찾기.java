class Solution {
    public int solution(String myString, String pat) {
        int answer = 1;
        StringBuilder sb = new StringBuilder(myString);
        
        for(int i=0; i<sb.length(); i++) {
            if(sb.charAt(i) == 'A') {
                sb.setCharAt(i, 'B');
            }
            else if(sb.charAt(i) == 'B') {
                sb.setCharAt(i, 'A');
            }
        }
        
        if(sb.indexOf(pat) == -1) {
            answer = 0;
        }
        return answer;
    }
}