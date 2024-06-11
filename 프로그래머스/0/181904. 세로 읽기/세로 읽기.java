class Solution {
    public String solution(String my_string, int m, int c) {
        int k = (my_string.length() / m);
        String queries[][] = new String[k][m];
        StringBuilder sb = new StringBuilder(my_string);
        StringBuilder temp = new StringBuilder();
        int p = 0;
        
        for(int i=0; i<k; i++) {
            for(int j=0; j<m; j++) {
                queries[i][j] = String.valueOf(sb.charAt(p));
                p++;
            }
        }    
        
        for (int i = 0; i < queries.length; i++) {
            temp.append(queries[i][c-1]);
        }
        
        String answer = temp.toString();
        
        return answer;
    }
}