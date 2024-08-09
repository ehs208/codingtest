class Solution {
    public int[][] solution(int n) {
        int answer[][] = new int[n][n];
        int number = 1;
        int k = n * n;
        
        int rowstart = 0; // 행 시작
        int rowend = n-1; // 행 끝
        int colstart = 0; // 열 시작
        int colend = n-1; // 열 끝
        
        while(number <= n * n) {
            for(int i=colstart; i<=colend; i++) {
                answer[rowstart][i] = number;
                number++;
            }
            rowstart++;
            for(int i=rowstart; i<=rowend; i++) {
                answer[i][colend] = number;
                number++;
            }
            colend--;
            for(int i=colend; i>=colstart; i--) {
                answer[rowend][i] = number;
                number++;
            }
            rowend--;
            for(int i=rowend; i>=rowstart; i--) {
                answer[i][colstart] = number;
                number++;
            }
            colstart++;
            
        }
        
        
        
        return answer;
    }
}