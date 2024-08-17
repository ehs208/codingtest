class Solution {
    public int solution(int hp) {
        int captain = 0;
        int soldier = 0;
        int worker = 0;
        int answer = 0;
        
        while (hp >= 5) {
            hp = hp - 5;
            captain++;
        }
        
        while (hp >= 3) {
            hp = hp - 3;
            soldier++;
        }
        
        worker = hp;
        answer = worker + soldier + captain;
        
        
        return answer;
    }
}