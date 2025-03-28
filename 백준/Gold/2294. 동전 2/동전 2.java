import java.util.*;
import java.io.*;

/*
    BAEKJOON 2294번 동전 2
    https://www.acmicpc.net/problem/2294
*/

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N;
        int K;
        int answer = 0;
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());


        int[] money = new int[N];
        int[] dp = new int[K+1];


        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 0; i < N; i++) {
            int coin = Integer.parseInt(br.readLine());
            money[i] = coin;
        }

        Arrays.sort(money);


        for(int i=1; i<dp.length; i++) {
            for(int j=0; j<money.length; j++) {
                if(i == money[j]) {
                    dp[i] = 1;
                }

                if(i - money[j] >= 0 && dp[i - money[j]] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i-money[j]] + 1);
                }
                // System.out.println("dp"+i+" " + dp[i]);
            }
        }

        answer = dp[K];

        if(answer == Integer.MAX_VALUE) {
            answer = -1;
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
