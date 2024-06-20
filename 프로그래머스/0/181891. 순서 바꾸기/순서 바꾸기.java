import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        
        int[] array1 = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] array2 = Arrays.copyOfRange(num_list, 0, n);
        int answer[] = new int[array1.length + array2.length];
        int j=0;
        
        for(int i=0; i<array1.length; i++) { 
            answer[i] = array1[i];
        }
        
        for(int i=array1.length; i<answer.length; i++) {
            answer[i] = array2[j];
            j++;
        }
        
        return answer;
    }
}