import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++) {
            if(!map.containsKey(nums[i])) {
            map.put(nums[i], 1);
            }
        }
        
        if(map.size() < nums.length / 2)
            return map.size();
        else
            return nums.length / 2;
        
        
 
    }
}