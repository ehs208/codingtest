class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int index = 0;
        int temp = 0;
        for(int i=myString.length(); i>=0; i--) {
            temp = index;
            index = myString.lastIndexOf(pat, i);
            if(index != -1 && index !=temp) {
                answer++;
            }
        }
        
        return answer;
    }
}