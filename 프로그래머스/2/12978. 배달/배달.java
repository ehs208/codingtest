import java.util.*;

class Solution {
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        ArrayList<ArrayList<int[]>> graph = new ArrayList<>();
        int[] distance = new int[N+1];
        
        Arrays.fill(distance, Integer.MAX_VALUE);
        
        for(int i=0; i<=N; i++) {
            graph.add(new ArrayList<>());
        }
        
        for(int i=0; i<road.length; i++) {
            int from = road[i][0];
            int to = road[i][1];
            int cost = road[i][2];
            
            graph.get(from).add(new int[]{to, cost});
            graph.get(to).add(new int[]{from, cost});
        }
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        
        pq.offer(new int[]{1,0});
        distance[1] = 0;
        
        while(!pq.isEmpty()) {
            int current[] = pq.poll();
            int cur = current[0];
            int cost = current[1];
            
            if(distance[cur] < cost) continue;
            
            for(int i=0; i<graph.get(cur).size(); i++) {
                int next[] = graph.get(cur).get(i);
                
                int neighbor = next[0];
                int nextCost = next[1];
                int newCost = cost + nextCost;
                
                if(newCost < distance[neighbor]) {
                    distance[neighbor] = newCost;
                    pq.offer(new int[]{neighbor, newCost});
                }
            }
        }
        
        for(int k=0; k<distance.length; k++) {
            if(distance[k] <= K) answer++;
        }

        return answer;
    }
}