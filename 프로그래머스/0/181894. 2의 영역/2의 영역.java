import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 2) {
                list.add(i);
            }
        }
        System.out.println(list);
        if(list.size() == 0) {
            return new int[] {-1};
        }
        else {
            int answer[] = new int[list.get(list.size()-1)-list.get(0) + 1];
            int j=0;
            for(int i=list.get(0); i<=list.get(list.size()-1); i++) {
                answer[j] = arr[i];
                j++;
            }
            return answer;
        }
            
        
    }
}