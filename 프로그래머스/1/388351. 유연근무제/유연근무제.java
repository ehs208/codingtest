import java.util.*;

class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int peopleCount = schedules.length;
        int count = peopleCount;
        boolean[][] absence = new boolean[peopleCount][7];
        
        for(int i=0; i<peopleCount; i++) {
            for(int j=0; j<7; j++) {
                int dayOfWeek = (j + startday) % 7;
                if(dayOfWeek == 0) dayOfWeek = 7;
                
                
                if(totalMinute(timelogs[i][j]) > totalMinute(schedules[i]) + 10 && dayOfWeek != 6 && dayOfWeek != 7) {
                    absence[i][j] = true;
                    count--;
                    break;
                }
            }
        }
        System.out.println(Arrays.deepToString(absence));

        return count;
    }
    
    public int totalMinute(int time) {
        int hour = time / 100;
        int minute = time % 100;
        
        return hour*60+minute;
    }
}