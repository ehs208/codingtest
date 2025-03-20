class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] words = s.split(" ", -1);
        
        
        for(int i=0; i<words.length; i++) {
            if(words[i].length() > 0) {
                char firstChar = Character.toUpperCase(words[i].charAt(0));
                String restOfWord = words[i].substring(1).toLowerCase();
                words[i] = firstChar + restOfWord;
            }
            
            answer.append(words[i]);
            if(i < words.length - 1) {
                answer.append(" ");
            }
        }
        
        return answer.toString();
    }
}