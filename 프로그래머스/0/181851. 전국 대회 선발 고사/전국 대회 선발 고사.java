import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<rank.length; i++) {
            if(attendance[i] == true) {
                list.add(i);
            }
        }
        
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (rank[list.get(j)] > rank[list.get(j+1)]) {
                    int temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }
        
        
        System.out.println(list);
        int answer = 10000 * list.get(0) + 100 * list.get(1) + list.get(2);
        return answer;
    }
}