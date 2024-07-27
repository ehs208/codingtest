class Solution {
    public int[] solution(int[] arr) {
        int size = 0; 
        int v = 0;
        for(int i=0; i<arr.length; i++) {
            size+=arr[i];
        }
        
        int[] answer = new int[size];
        
        for(int k=0; k<arr.length; k++) {
            for(int j=0; j<arr[k]; j++) {
                answer[v] = arr[k];
                v++;
            } 
        }
        
        return answer;
    }
}