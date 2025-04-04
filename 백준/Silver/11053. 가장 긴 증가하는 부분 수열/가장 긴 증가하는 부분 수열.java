import java.util.*;
import java.io.*;

/*
    BAEKJOON 11053번 가장 긴 증가하는 부분 수열
    https://www.acmicpc.net/problem/11053
*/

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] nums = new int[N];
        int[] dp = new int[N];
        Arrays.fill(dp, 1);

        int max = 1;
        int temp = 0;

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=1; i<N; i++) {
            temp = 0;
            for(int j=0; j<=i; j++) {
                if(nums[j] < nums[i]) {
                    temp = Math.max(dp[j], temp);
                    // System.out.println(temp);
                    dp[i] = temp + 1;
                }
            }
            // System.out.println("인덱스" + i + "값" + nums[i] + "최대값" + dp[i]);
            max = Math.max(dp[i], max);


        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
        br.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
