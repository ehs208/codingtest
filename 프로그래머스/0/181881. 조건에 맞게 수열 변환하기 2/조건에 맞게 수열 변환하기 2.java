import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int temp[] = new int[arr.length];
        int k = 0;
        while(true) {
            for(int j=0;j<arr.length;j++) {
                temp[j] = arr[j];
            }
            for(int i=0; i<arr.length; i++) {
                if(arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                }
                else if(arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                }
                
            }
            k++;
                if(Arrays.equals(temp, arr)) {
                    break;
        }
    }
        return k-1;
    }
}