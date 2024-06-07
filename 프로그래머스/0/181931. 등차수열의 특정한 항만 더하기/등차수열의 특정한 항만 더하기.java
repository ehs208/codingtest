class Solution {
    public int solution(int a, int d, boolean[] included) {
        int k = 0;
        int answer = 0;
        for(int i=0; i<included.length; i++) {
            if(i == 0) {
                k = a;
            }
            else {
            k = k + d; 
            }
            if(included[i]) {
                System.out.println(k);
                answer = answer + k;
            }
        }
        
        return answer;
    }
}