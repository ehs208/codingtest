class Solution {

    boolean[] visited;
    int[][] computers;
    int answer;
    public int solution(int n, int[][] computers) {

        
        this.computers = computers;
        this.answer = 0;
        
        visited = new boolean[n];
        
        for(int j=0; j<computers.length; j++) {
            answer+=dfs(j, 0);    
        }
        
        return answer;
    }
    
    public int dfs(int current, int count) {
        if(visited[current] == true) {
            return 0;
        }
        
        visited[current] = true;
        count=count+1;
        
        for(int i=0; i<computers[current].length; i++) {
            if(computers[current][i] == 1) {
            dfs(i, count);
            }
        }
        
        return count;
    }
    
}