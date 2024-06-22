class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int i=0;
        
        while(true) {            
            answer+=numbers[i];
            i++;
                if(answer > n) {
                    break;
                }
        }
        return answer;
    }
}