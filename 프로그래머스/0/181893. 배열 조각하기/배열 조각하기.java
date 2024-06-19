import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        
        
         for (int num : arr) {
            temp.add(num);
        }
        for(int i=0;i<query.length;i++) {
            temp.addAll(list);
            list.clear();
            
            if(i%2 == 0) {
                for(int j=0;j<=query[i];j++) {
                    list.add(temp.get(j));
                }
                
            }
            else {
                for(int j=query[i];j<temp.size();j++) {
                    list.add(temp.get(j));
                }
            }
            temp.clear();
        }
        
         int[] answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++)
                answer[i] = list.get(i);
        return answer;
    }
}