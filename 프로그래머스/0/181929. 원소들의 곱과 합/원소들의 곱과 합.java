class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int sum = 1;
        int square = 0;
        for(int i=0; i<num_list.length; i++) {
            sum = sum * num_list[i];
            square = square + num_list[i];
        }
        
        if (sum > square * square)
            return 0;
        else
            return 1;
    }
}