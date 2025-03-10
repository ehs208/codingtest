import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int len = numbers.length;
        int[] answer = new int[len];
        
        answer[len-1] = -1;
        Stack<Integer> stack = new Stack<>();
        
        stack.push(numbers[len-1]);
        
        for(int i=len-2; i>=0; i--) {
            while(!stack.isEmpty() && stack.peek() <= numbers[i]) {
                stack.pop();
            }
            
            if(stack.isEmpty()) {
                answer[i] = -1;
            } else {
                answer[i] = stack.peek();
            }
            
            stack.push(numbers[i]);
        }
        
        return answer;
    }
}