import java.util.*;
import java.io.*;

/*
    BAEKJOON 1316번 그룹 단어 체커
    https://www.acmicpc.net/problem/1316
*/

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int answer = 0;
        int line = Integer.parseInt(st.nextToken());

        for(int i = 0; i < line; i++) {
            String word = br.readLine();
            if(check(word)) {
                answer++;
            }
        }

        
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static boolean check(String word) {
        HashSet<String> set = new HashSet<>();
        String[] words = word.split("");
        String temp;
        for(int i = 1; i < words.length; i++) {
            temp = words[i-1];
            set.add(temp);
            if(!temp.equals(words[i]) && set.contains(words[i])) {
                return false;
            }
        }

        return true;
    }
}
