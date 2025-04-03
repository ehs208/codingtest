import java.util.*;
import java.io.*;

/*
    BAEKJOON 12865번 평범한 배낭
    https://www.acmicpc.net/problem/12865
*/

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.valueOf(st.nextToken()); // 물품의 수
        int K = Integer.valueOf(st.nextToken()); // 최대 무게

        int[][] items = new int[N][2];
        int[] dp = new int[K+1];

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int weight = Integer.valueOf(st.nextToken());
            int value = Integer.valueOf(st.nextToken());
            items[i][0] = weight;
            items[i][1] = value;
        }

        for (int i = 0; i < N; i++) {
            int weight = items[i][0];
            int value = items[i][1];

            for (int j = K; j >= weight; j--) {
                dp[j] = Math.max(dp[j], dp[j - weight] + value);
            }
        }


        bw.write(String.valueOf(dp[K]));
        bw.flush();
        bw.close();
        br.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
