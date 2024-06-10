import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] dice = new int[4];
        dice[0] = a;
        dice[1] = b;
        dice[2] = c;
        dice[3] = d;
        
        Arrays.sort(dice);
        
        if (dice[0] == dice[3]) {
            answer = dice[0] * 1111;
        } else if (dice[0] != dice[1] && dice[1] != dice[2] && dice[2] != dice[3] && dice[3] != dice[0]) {
            answer = dice[0];
        } else if (dice[0] == dice[1] && dice[2] == dice[3] && dice[1] != dice[2]) {
            answer = (dice[0] + dice[2]) * Math.abs(dice[0] - dice[2]);
            
        } else if (dice[1] == dice[2] && dice[2] == dice[3] && dice[0] != dice[3]) {
            answer = (10 * dice[3] + dice[0]) * (10 * dice[3] + dice[0]);
        }
        else if(dice[0] == dice[1] && dice[1] == dice[2] && dice[0] != dice[3]) {
            answer = (10 * dice[0] + dice[3]) * (10 * dice[0] + dice[3]);
        }
        else if (dice[0] == dice[1] && dice[2] != dice[3]) {
            answer = dice[2] * dice[3];
        } 
        else if((dice[1] == dice[2] && dice[0] != dice[3]))
            answer = dice[0] * dice[3];
        else if((dice[2] == dice[3] && dice[0] != dice[1]))
            answer = dice[0] * dice[1];
        return answer;
    }
}
