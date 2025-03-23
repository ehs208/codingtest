class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int len = triangle.length;
        int[][] dp = new int[len][len];
        
        for(int i=len-2; i>=0; i--) {
            for(int j=0; j<triangle[i].length; j++) {
                if(triangle[i][j] + triangle[i+1][j] > triangle[i][j] + triangle[i+1][j+1]) {
                    triangle[i][j] = triangle[i][j] + triangle[i+1][j];
                }
                else {
                    triangle[i][j] = triangle[i][j] + triangle[i+1][j+1];
                }
            }
        }
        return triangle[0][0];
    }
}