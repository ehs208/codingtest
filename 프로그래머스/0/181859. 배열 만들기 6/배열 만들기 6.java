import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int i=0;
        ArrayList<Integer> stk = new ArrayList<>();
        
        while(i<arr.length) {
            if(stk.size() == 0) {
                stk.add(arr[i]);
                i++;
            }
            else if(stk.get(stk.size()-1) == arr[i]) {
                stk.remove(stk.size()-1);
                i++;
            }
            else if(stk.get(stk.size()-1) != arr[i]) {
                stk.add(arr[i]);
                i++;
            }
        }
        
        
        int[] answer = new int[stk.size()];
        for(int k=0; k<stk.size(); k++) {
            answer[k] = stk.get(k);
        }
        
        if(answer.length == 0)
            return new int[]{-1};
        
        return answer;
    }
}