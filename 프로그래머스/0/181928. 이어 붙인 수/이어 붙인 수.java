import java.util.ArrayList;

class Solution {
  
    public int solution(int[] num_list) {
        ArrayList<Integer> even_list = new ArrayList<>();
        ArrayList<Integer> odd_list = new ArrayList<>();
        String even_sum = "";
        String odd_sum = "";
        String temp ="";
        for(int i=0; i<num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even_list.add(num_list[i]);
                }
            else {
                odd_list.add(num_list[i]);
            }
        }
        
        for(int k=0; k<even_list.size(); k++) {
            temp = even_list.get(k).toString();
            even_sum += temp;
        }
         for(int j=0; j<odd_list.size(); j++) {
            temp = odd_list.get(j).toString();
            odd_sum += temp;
        }
        
        return Integer.parseInt(odd_sum) + Integer.parseInt(even_sum);
        
    }
}