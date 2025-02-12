import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] numbers) {
        
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> resultList = new ArrayList<>();
        
        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                list.add(numbers[i] + numbers[j]);
            }
        }
        
        for(int k=0; k<list.size(); k++) {
            if(!resultList.contains(list.get(k))) {
                resultList.add(list.get(k));
            }
        }
        
        
        Collections.sort(resultList);
        
        return resultList;
    }
}