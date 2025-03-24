class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int MOD = 1000000007;
        
        int[][] dp = new int[m+1][n+1];
        boolean[][] isPuddles = new boolean[m+1][n+1];
        
        for(int i=0; i<puddles.length; i++) {
            isPuddles[puddles[i][0]][puddles[i][1]] = true;
        }
        
        dp[1][1] = 1;
        
        for(int j=2; j<=n; j++) {
            if(!isPuddles[1][j]) {
                dp[1][j] = dp[1][j-1];
            }
        }
        
        for(int i=2; i<=m; i++) {
            if(!isPuddles[i][1]) {
                dp[i][1] = dp[i-1][1];
            }
        }
    
        for(int i=2; i<=m; i++) {
            for(int j=2; j<=n; j++) {
                if(!isPuddles[i][j]) {
                    dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % MOD;
                }
            }
        }
        
        return dp[m][n];
    }
}