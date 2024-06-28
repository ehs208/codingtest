class Solution {
    public int[] solution(String myString) {
        String list[] = myString.split("x", -1);
        int answer[] = new int[list.length];
        
        
        
        for(int i=0; i<list.length; i++) {
            answer[i] = list[i].length();
        }
        return answer;
    }
}