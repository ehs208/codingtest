import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
    BAEKJOON 1697번 숨바꼭질
    https://www.acmicpc.net/problem/1697
*/

public class Main {
	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken()); // 수빈이
		int K = Integer.parseInt(st.nextToken()); // 동생
		int answer = 0;
		boolean[] visited = new boolean[100001];

		if (N == K) {
			answer = 0;
		}
		Queue<int[]> queue = new LinkedList<>();

		queue.offer(new int[] {N, 0});
		while (!queue.isEmpty()) {
			int[] current = queue.poll();
			int x = current[0];
			int count = current[1];
			// System.out.println("좌표" + x + "카운트" + count);

			if (x == K) {
				answer = current[1];
				break;
			}

			if (x <= K && x * 2 < 100001) {
				if (visited[x * 2] == false) {
					queue.offer(new int[] {x * 2, count + 1});
					visited[x] = true;
				}
			}

			if (x <= K && x + 1 < 100001) {
				if (visited[x + 1] == false) {
					queue.offer(new int[] {x + 1, count + 1});
					visited[x] = true;
				}
			}

			if (x - 1 >= 0) {
				if (visited[x - 1] == false) {
					queue.offer(new int[] {x - 1, count + 1});
					visited[x] = true;
				}
			}
		}
			bw.write(String.valueOf(answer));
			bw.flush();
			bw.close();
			br.close();

	}
		public static void main (String[]args) throws IOException {
			solution();
		}
	}

