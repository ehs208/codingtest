class Solution {
    public String solution(String my_string, int n) {
        int start = my_string.length() - n;
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for(int i=start; i<my_string.length(); i++) {
            sb.append(my_string.charAt(i));
        }
        
        answer = sb.toString();
        return answer;
    }
}