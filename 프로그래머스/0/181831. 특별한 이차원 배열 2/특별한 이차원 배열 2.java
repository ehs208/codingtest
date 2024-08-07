class Solution {
    public int solution(int[][] arr) {
        int answer = 1;
        
        
        
        for(int i=0; i<arr.length; i++){
            if(answer==0)
                break;
            for(int j=0; j<arr[i].length; j++) {
                 if(answer==0)
                break;
                if(arr[i][j]!=arr[j][i])
                    answer = 0;
            }
        }
        return answer;
    }
}