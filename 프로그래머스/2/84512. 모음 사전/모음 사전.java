import java.util.*;

class Solution {
    int count = 0;    
    int answer = 0; 
    boolean isFound;
    String words[] = {"A", "E", "I", "O", "U"};
    String word;
    public int solution(String word) {
        int answer = 0;
        this.word = word;
        
        dfs("");
        
        return count;
    }
    
    public void dfs(String cur) {
        if(isFound) return;
        
        if(cur.equals(word)) {
            isFound = true;
            return;
        }
        if(cur.length() > 5) {
            return;
       }
        count++;
        for(int i=0; i<words.length; i++) {
            dfs(cur+words[i]);
        }
        return;
    }
}