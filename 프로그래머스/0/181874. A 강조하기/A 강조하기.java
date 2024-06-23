class Solution {
    public String solution(String myString) {
        String answer = "";
        StringBuilder sb = new StringBuilder(myString);
        for(int i=0; i<sb.length(); i++) {
            if(sb.charAt(i) == 'a') {
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
            }
            else if(sb.charAt(i) != 'A') {
                sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
            }
        }
        return sb.toString();
    }
}