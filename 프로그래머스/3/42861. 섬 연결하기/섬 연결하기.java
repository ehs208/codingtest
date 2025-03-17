import java.util.*;

class Solution {
    
    // Find 연산: 원소가 속한 집합의 대표 원소 찾기
    public int find(int[] parent, int x) {
        if (parent[x] == x) return x;
        // 경로 압축(Path Compression) 최적화
        return parent[x] = find(parent, parent[x]);
    }
    
    // Union 연산: 두 집합 합치기
    public void union(int[] parent, int a, int b) {
        a = find(parent, a);
        b = find(parent, b);
        
        if (a < b) parent[b] = a;
        else parent[a] = b;
    }
    
    public int solution(int n, int[][] costs) {
        // 1. 간선을 비용순으로 정렬
        Arrays.sort(costs, (a, b) -> a[2] - b[2]);
        
        // 2. 각 정점이 속한 집합 초기화
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i; // 초기에는 자기 자신이 대표
        }
        
        int totalCost = 0;
        int edgeCount = 0;
        
        // 3. 간선을 하나씩 확인
        for (int[] edge : costs) {
            int from = edge[0];
            int to = edge[1];
            int cost = edge[2];
            
            // 사이클이 발생하지 않는 경우에만 간선 선택
            if (find(parent, from) != find(parent, to)) {
                union(parent, from, to);
                totalCost += cost;
                edgeCount++;
                
                // n-1개의 간선이 선택되면 MST 완성
                if (edgeCount == n - 1) {
                    break;
                }
            }
        }
        
        return totalCost;
    }
}