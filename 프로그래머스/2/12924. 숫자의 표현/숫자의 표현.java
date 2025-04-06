class Solution {
    
    int n;
    int count = 0;
    int[] nums;
    public int solution(int n) {
        int answer = 0;
        this.n = n;
        for(int i=1; i<n+1; i++) {
            dfs(i, 0);
        }
        
        return count;
    }
    
    public void dfs(int num, int sum) {
        if(sum > n) return;
        if(sum == n) {
            count++;
            return;
        }
        
        sum = sum + num;
        dfs(num+1, sum);
        
    }
}