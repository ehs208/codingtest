class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        int i = idx;
        
        System.out.println(arr.length - idx);
        
        while(i < arr.length) {
            
            if(arr[i] == 1) {
                answer = i;
                break;
        }
            else answer = -1;
            i++;
    }
           return answer;
}
}