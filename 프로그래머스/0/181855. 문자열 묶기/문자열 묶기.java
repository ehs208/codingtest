import java.util.Arrays;

class Solution {
    public int solution(String[] strArr) {
        int temp[] = new int[30];
            
        for(int i=0; i<strArr.length; i++) {
            temp[strArr[i].length()-1]+=1;
        }
        
        Arrays.sort(temp);
        int answer = temp[temp.length -1];
        return answer;
    }
}