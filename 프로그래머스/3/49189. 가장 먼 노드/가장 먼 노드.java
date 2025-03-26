import java.util.*;

class Solution {
    
    public int solution(int n, int[][] edge) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        boolean[] isVisited = new boolean[n+1];
        int answer = 0;
        int maxCount = 0;
        for (int i = 0; i <= n; i++) {
           graph.add(new ArrayList<>());
        }
        
        for(int i=0; i<edge.length; i++) {
            graph.get(edge[i][0]).add(edge[i][1]);
            graph.get(edge[i][1]).add(edge[i][0]);
            
        }
        
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{1,1});
        isVisited[1] = true;
        
        while(!q.isEmpty()) {
            int[] current = q.poll();
            
            int node = current[0];
            int count = current[1];
    
            if (count > maxCount) {
                answer = 0;
                maxCount = count;
            }
            
            if (count == maxCount) {
                answer++;
            }
            
            for(int i=0; i<graph.get(node).size(); i++) {
                int next = graph.get(node).get(i);
                if(!isVisited[next]) {
                    q.offer(new int[]{next, count+1});
                    isVisited[next] = true;
                }
            }
        }
        
        
        return answer;
    }
}