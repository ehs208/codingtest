import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String firstLine = br.readLine();
        StringTokenizer st = new StringTokenizer(firstLine, " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        List<Integer> result = new ArrayList<>();

        while (!queue.isEmpty()) {
            for (int i = 1; i < k; i++) {
                queue.offer(queue.poll());
            }
            result.add(queue.poll());
        }

        System.out.print("<");
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i != result.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(">");
    }
}
