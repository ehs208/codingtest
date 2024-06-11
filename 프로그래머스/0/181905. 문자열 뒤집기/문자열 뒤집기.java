class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder(my_string);
        String answer = "";
        char temp;
        
        while(true) {
            temp = sb.charAt(s);
            sb.setCharAt(s, sb.charAt(e));
            sb.setCharAt(e, temp);
            s++;
            e--;
            if(s>=e) {
                break;
            }
        }
        answer = sb.toString();
        
        return answer;
    }
}