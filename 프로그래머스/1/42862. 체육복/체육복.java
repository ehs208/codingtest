import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] students = new int[n];
        int answer = 0;
        
        Arrays.fill(students, 1);
        
        for(int i=0; i<lost.length; i++) {
            students[lost[i]-1]-=1;
        }
        
        for(int k=0; k<reserve.length; k++) {
            students[reserve[k]-1]+=1;
        }
        
        for(int j=0; j<students.length; j++) {
            if(students[j] > 1) {
                if(j-1>=0 && students[j-1] == 0) {
                    students[j]--;
                    students[j-1]++;
                }
                else if(j+1<n && students[j+1] == 0) {
                    students[j]--;
                    students[j+1]++;
                }
            }
        }
        
        for(int student: students) {
            if(student > 0) {
                answer++;
            }
        }
        

        return answer;
    }
}