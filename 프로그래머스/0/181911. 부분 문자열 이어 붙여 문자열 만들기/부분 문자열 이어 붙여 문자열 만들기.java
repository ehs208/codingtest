class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        String temp = "";
        for(int i=0; i<my_strings.length; i++) {
            temp = my_strings[i];
            for(int j=parts[i][0]; j<=parts[i][1]; j++) {
                sb.append(temp.charAt(j));
            }
        }
        answer=sb.toString();
        return answer;
    }
}