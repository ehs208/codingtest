import java.lang.Math;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int first = 0;
        int second = 0;
        
        if(a % 2 == 0)
            first = 1;
        if(b % 2 == 0)
            second = 1;
        
        if(first == 0 && second == 0)
            answer = a * a + b * b;
        else if (first == 0 && second == 1)
            answer = 2 * (a + b);
        else if (first == 1 && second == 0)
            answer = 2 * (a + b);
        else
            answer = Math.abs(a-b);
        
        return answer;
    }
}