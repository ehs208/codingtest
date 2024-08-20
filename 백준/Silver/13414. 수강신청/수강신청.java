import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String firstLine = br.readLine();
        StringTokenizer st = new StringTokenizer(firstLine, " ");

        int maxCapacity = Integer.parseInt(st.nextToken());
        int studentCount = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < studentCount; i++) {
            String studentId = br.readLine();
            map.put(studentId, i);
        }

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort(Map.Entry.comparingByValue());

        int count = 0;
        for(Map.Entry<String, Integer> entry : entries){
            count++;
            System.out.println(entry.getKey());
            if(count == maxCapacity) break;
        }
    }
}
