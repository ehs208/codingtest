import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        boolean[][] visited = new boolean[11][11];
        HashSet<String> set = new HashSet<>();
        
        int x = 0;
        int y = 0;
        
        for(int i=0; i<dirs.length(); i++) {
            int nx = x;
            int ny = y;
            char alphabet = dirs.charAt(i);
            String path;
            
            if(alphabet == 'U' && y+1 <= 5) {
                ny = y+1;
            }
            else if(alphabet == 'D' && y-1 >= -5) {
                ny = y-1;
            }
            else if(alphabet == 'R' && x+1 <= 5) {
                nx = x+1;
            }
            else if(alphabet == 'L'&& x-1 >= -5) {
                nx = x-1;
            }
            else continue;
            
            int x1 = x;
            int x2 = nx;
            int y1 = y;
            int y2 = ny;
            
            if (x1 < x2 || (x1 == x2 && y1 < y2)) {
                path = x1 + "," + y1 + ":" + x2 + "," + y2;
            } else {
                path = x2 + "," + y2 + ":" + x1 + "," + y1;
            }
            set.add(path);
            
            x = nx;
            y = ny;
            
        }
        
        answer = set.size();
        
        return answer;
    }
}