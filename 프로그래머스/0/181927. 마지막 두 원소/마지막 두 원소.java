import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] num_list) {
        int[] answer = {};
        int previous = 0;
        int next = 0;
        ArrayList<Integer> dynamicList = new ArrayList<>();
        for(int i=0; i<num_list.length; i++) {
            if(i==num_list.length - 2) {
                previous = num_list[i];
            }
            else if (i==num_list.length -1) {
                next = num_list[i];
            }
        }
        
        for (int num : num_list) {
            dynamicList.add(num);
        }
        
        if(next > previous) {
                dynamicList.add(next - previous);
            }
            else
                dynamicList.add(next * 2);
        
        return dynamicList;
    }
}