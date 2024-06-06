class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String ab = Integer.toString(a) + Integer.toString(b);
        String doubleab = Integer.toString(a*b*2);
        
        if (Integer.parseInt(ab) >= Integer.parseInt(doubleab)) {
            return Integer.parseInt(ab);
        }
        else 
            return Integer.parseInt(doubleab);
    }
}