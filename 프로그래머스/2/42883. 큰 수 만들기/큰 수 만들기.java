import java.util.*;

class Solution {
    public String solution(String number, int k) {
        int numberLength = number.length();
        int targetNumLength = number.length() - k;
        StringBuilder sb = new StringBuilder();
        Stack<Character> numbersStack = new Stack();
        
        numbersStack.push(number.charAt(0));
        
       
        for(int i=1; i<numberLength; i++) {
            while(!numbersStack.isEmpty() && k > 0 && number.charAt(i) > numbersStack.peek()) { 
                k--;
                numbersStack.pop();
            }
            numbersStack.push(number.charAt(i));
        }
        
        
        while(!numbersStack.isEmpty()) {
            sb.append(numbersStack.pop());
        }
        
        String answer = sb.reverse().toString().substring(0, targetNumLength);
        
        return answer;
    }
}