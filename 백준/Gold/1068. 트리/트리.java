import java.util.*;
import java.io.*;

/*
    BAEKJOON 1068번 트리
    https://www.acmicpc.net/problem/1068
*/

public class Main {
    static ArrayList<ArrayList<Integer>> graph =  new ArrayList<>();;
    static boolean[] isVisited;
    static int answer = 0;
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Integer> starts = new ArrayList<>();

        int N = Integer.parseInt(st.nextToken()); // 정점 수
        isVisited = new boolean[N];

        for(int i=0; i<N; i++) {
            graph.add(new ArrayList<>());
        }

        StringTokenizer numTokens = new StringTokenizer(br.readLine());
        StringTokenizer deletedNodes = new StringTokenizer(br.readLine());
        int deletedNode = Integer.parseInt(deletedNodes.nextToken());

        for(int i=0; i<N; i++) {
            int index = Integer.parseInt(numTokens.nextToken());
            if(index == -1) {
                starts.add(i);
                continue;
            }
            if(i == deletedNode || index == deletedNode) continue;
            graph.get(index).add(i);
        }

        for(int i=0; i<starts.size(); i++) {
            if(!starts.get(i).equals(deletedNode)) {
                dfs(starts.get(i));
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }

    public static void dfs(int startNode) {
        if(isVisited[startNode] == true) return;
        isVisited[startNode] = true;
        if(graph.get(startNode).size() == 0) {
            // System.out.println("정답노드"+startNode);
            answer++;
            return;
        }

        for(int i=0; i<graph.get(startNode).size(); i++) {
            // System.out.println("시작노드" + startNode + "목표노드" + graph.get(startNode).get(i));
            dfs(graph.get(startNode).get(i));
        }

    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
