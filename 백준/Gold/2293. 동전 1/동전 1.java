import java.util.*;
import java.io.*;

/*
    BAEKJOON 2293번 동전 1
    https://www.acmicpc.net/problem/2293
*/

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 동전의 개수
        int K = Integer.parseInt(st.nextToken()); // 원하는 금액

        int[] dp = new int[K+1];
        dp[0] = 1;
        int[] coins = new int[N];
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int coin = Integer.parseInt(st.nextToken());
            coins[i] = coin;
        }

        for(int i=0; i<coins.length; i++) {
            for(int j=coins[i]; j <= K; j++) {
                dp[j] = dp[j] + dp[j - coins[i]];
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
