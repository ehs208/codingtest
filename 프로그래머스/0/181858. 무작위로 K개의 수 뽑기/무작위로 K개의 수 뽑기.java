import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++) {
            if(!list.contains(arr[i])) {
            list.add(arr[i]);
            }
        }
        
        while(list.size() < k) {
            list.add(-1);
        }
        
        for(int j=0; j<answer.length; j++) {
            answer[j] = list.get(j);
        }
        
        return answer;
    }
}