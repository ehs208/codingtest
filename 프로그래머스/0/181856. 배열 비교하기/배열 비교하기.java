class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int alength = arr1.length;
        int blength = arr2.length;
        int asum = 0;
        int bsum = 0;
        for(int i=0; i<alength; i++) {
            asum+=arr1[i];
        }
        for(int j=0; j<blength; j++) {
            bsum+=arr2[j];
        }
        
        if(alength != blength) {
            if(alength > blength) 
                answer = 1;
            else
                answer = -1;
        }
        else if(alength == blength) {
            if(asum==bsum)
                answer = 0;
            else if(asum > bsum) {
                answer = 1;
            }
            else {
                answer = -1;
            }
        }
        return answer;
    }
}