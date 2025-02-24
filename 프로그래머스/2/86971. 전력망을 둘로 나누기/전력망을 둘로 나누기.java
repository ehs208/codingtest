import java.util.*;

class Solution {
    ArrayList<ArrayList<Integer>> graph;
    boolean[] visited;
    int count = 0;
    
    public int solution(int n, int[][] wires) {
        graph = new ArrayList<>();
        int current = 1;
        int answer = n;
        
        for(int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        
        for(int[] wire : wires) {
            int v1 = wire[0];
            int v2 = wire[1];
             
            graph.get(v1).add(v2);
            graph.get(v2).add(v1);
        }
        
        
        for(int[] wire : wires) {
            
            this.visited = new boolean[graph.size()];
            
            graph.get(wire[0]).remove(Integer.valueOf(wire[1]));
            graph.get(wire[1]).remove(Integer.valueOf(wire[0]));
            
            int count = dfs(1);
            int diff = Math.abs(count - (n - count));
            answer = Math.min(answer, diff);
            
            graph.get(wire[0]).add(wire[1]);
            graph.get(wire[1]).add(wire[0]);
        }
        
        
       return answer;
        
    }
    
    public int dfs(int cur) {
            int count = 1;
            visited[cur] = true;
            for(int j=0; j<graph.get(cur).size(); j++) {
                if(!visited[graph.get(cur).get(j)]) {
                count += dfs(graph.get(cur).get(j));
                }
            }
        return count;
        }
}