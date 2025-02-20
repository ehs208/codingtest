import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        
        int[] user1 = {1, 2, 3, 4, 5};
        int[] user2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] user3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];
        
        for(int i=0 ; i<answers.length; i++) {
            if(answers[i] == user1[i % 5])
                score[0]++;
            if(answers[i] == user2[i % 8])
                score[1]++;
            if(answers[i] == user3[i % 10])
                score[2]++;
        }
        
        
        int[] newScore = Arrays.copyOf(score, 3);
        Arrays.sort(newScore);
        
        int maxScore = newScore[2];
        
        ArrayList<Integer> temp = new ArrayList<>();
        
        for(int k=0; k<3; k++) {
            if(maxScore == score[k]) {
                temp.add(k+1);
            }
        }
        
        int[] answer = new int[temp.size()];
                
        for(int j=0; j<temp.size(); j++) {
            answer[j] = temp.get(j);
        }
        
        return answer;
    }
}