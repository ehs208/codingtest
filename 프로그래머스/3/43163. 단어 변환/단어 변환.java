import java.util.*;

class Data {
    String word;
    int count;

    public Data(String word, int count) {
        this.word = word;
        this.count = count;
    }
}

class Solution {
    public int solution(String begin, String target, String[] words) {
        boolean[] isVisited = new boolean[words.length];
        
        Queue<Data> queue = new LinkedList<>();
        queue.offer(new Data(begin, 0));
        
        while(!queue.isEmpty()) {
            Data now = queue.poll();
            if(now.word.equals(target)) return now.count;
            
            for(int i=0; i<words.length; i++) {
                if(!isVisited[i] && checkChange(now.word, words[i])) {
                    queue.offer(new Data(words[i], now.count + 1));
                    isVisited[i] = true;
                }
            }
            
        }
        
        return 0;
    }
    
    public boolean checkChange(String first, String second) {
        int count =0;
        for(int i=0; i<first.length(); i++) {
            if(first.charAt(i) != second.charAt(i)) {
                count++;
            }
        }
        if (count == 1) return true;
        return false;
    }
    
}