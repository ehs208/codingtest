class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String list[] = binomial.split(" ");
        
        int num1 = Integer.parseInt(list[0]);
        int num2 = Integer.parseInt(list[2]);
        
        switch(list[1]) {
            case "+":
                answer = num1 + num2;
                break;
            case "-": 
                answer = num1 - num2;
                break;
            case "*": 
                answer = num1 * num2;
                break;
        }
            return answer;
    }
}