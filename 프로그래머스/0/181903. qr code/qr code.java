class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        StringBuilder temp = new StringBuilder();
        for(int i=0;i<code.length();i++) {
            int k = i%q;
            if(k==r) {
                temp.append(code.charAt(i));
            }
        }
        answer = temp.toString();
        return answer;
    }
}