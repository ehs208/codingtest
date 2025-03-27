import java.util.*;
import java.io.*;

/*
    BAEKJOON 2075번 N번째 큰 수
    https://www.acmicpc.net/problem/2075
*/

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> Integer.compare(o2[0], o1[0]));

        int N = Integer.parseInt(st.nextToken());
        int count = 0;
        int answer = 0;
        int[][] numbers = new int[N][N];
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                numbers[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        for(int i=0; i<N; i++) {
            pq.offer(new int[]{numbers[N-1][i], N-1, i});
        }

        while(count < N) {
            int[] number = pq.poll();
            int x = number[1];
            int y = number[2];
            answer = number[0];
            count++;
            if(x>0) pq.offer(new int[]{numbers[x-1][y], x-1, y});
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
