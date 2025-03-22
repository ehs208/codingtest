import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int xLen = maps.length;
        int yLen = maps[0].length;
        
        boolean[][] visited = new boolean[xLen][yLen];
        
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        
        Queue<int[]> queue = new LinkedList<>();
        
        queue.add(new int[]{0, 0, 1});
        visited[0][0] = true;
        
        while(!queue.isEmpty()) {
            int[] now = queue.poll();
            int x = now[0];
            int y = now[1];
            int distance = now[2];
            
            if(x == xLen - 1 && y == yLen - 1) {
                return distance;
            }
            
            for(int i=0; i<4; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];
                
                if(newX < 0 || newX >= xLen || newY < 0 || newY >= yLen) continue;
                if(visited[newX][newY]) continue;
                if(maps[newX][newY] == 0) continue;
                
                queue.offer(new int[]{newX, newY, distance + 1});
                visited[newX][newY] = true;
            }
        }
        
        return -1;
    }
}