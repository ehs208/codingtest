class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);
        String answer ="";
        int j, p;
        char temp;
        for(int i=0; i<queries.length; i++) {
            j = queries[i][0];
            p = queries[i][1];
            while(true) {
                temp = sb.charAt(j);
                sb.setCharAt(j, sb.charAt(p));
                sb.setCharAt(p, temp);
                j++;
                p--;
                if(j>=p) {
                    break;
                }
            }
        }
        answer = sb.toString();
        return answer;
    }
}