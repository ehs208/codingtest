import java.util.*;
import java.io.*;

/*
    BAEKJOON 1000번 A+B
    https://www.acmicpc.net/problem/1000
*/

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = 0;
        int b = 0;

        while (st.hasMoreTokens()) {
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
        }


        int answer = a + b;

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
