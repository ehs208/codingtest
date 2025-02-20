import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int length = sizes.length;
        int width[] = new int[length];
        int height[] = new int[length];
        int answer = 0;
        int temp = 0;
        for(int i=0; i<sizes.length; i++) {
            if(sizes[i][0] < sizes[i][1]) {
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            width[i] = sizes[i][0];
            height[i] = sizes[i][1];
        }
        
        Arrays.sort(width);
        Arrays.sort(height);
        
        answer = width[length-1] * height[length-1];

        return answer;
    }
}