class Solution {
    
    int count = 0;
    int n;
    int[] chessLocation;
    public int solution(int n) {
        this.n = n;
        this.chessLocation = new int[n];
        int answer = 0;
        
        dfs(0);
        
        return count;
    }
    
    public void dfs(int y) {
        if(y == n) {
            count++;
            return;
        }
       
        for (int x = 0; x < n; x++) {
            boolean isValid = true;
            for(int prevY=0; prevY<y; prevY++) {
                int prevX = chessLocation[prevY];
                if (x == prevX || Math.abs(x - prevX) == Math.abs(y - prevY)) {
                    isValid = false;
                    break;
                }
        }
        
        if (!isValid) continue;
            
        chessLocation[y] = x;
        dfs(y+1);
        }
    }
}