class Solution {
    int[][] dungeons;
    boolean[] isVisited;
    int answer = -1;
    
    public int solution(int k, int[][] dungeons) {
        int length = dungeons.length;
        
        this.dungeons = dungeons;
        this.isVisited = new boolean[length];
        
        dfs(k, 0);
        
        return answer;
    }
    
    public void dfs(int tired, int count) {
        answer = Math.max(answer, count);
        
        for(int i=0; i<dungeons.length; i++) {
            if(!isVisited[i] && tired >= dungeons[i][0]) {
                isVisited[i] = true;
                dfs(tired - dungeons[i][1], count + 1);
                isVisited[i] = false; 
        
        }
        }
    }
    
}