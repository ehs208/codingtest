

class Solution {
    public int[][] solution(int[][] arr) {
        int line = arr.length;
        int row = arr[0].length;
        int[][] answer;
        
        if(line > row) {
            answer = new int[line][row+(line-row)];
                for(int i=0; i<line; i++) {
                    for(int j=0; j<row; j++) {
                        answer[i][j] = arr[i][j];
                    }
                }
        }
        else if(line < row) {
            answer = new int[line+(row-line)][row];
                for(int i=0; i<line; i++) {
                    for(int j=0; j<row; j++) {
                        answer[i][j] = arr[i][j];
                    }
                }
        }
        else {
            answer = arr;
        }
        return answer;
    }
}