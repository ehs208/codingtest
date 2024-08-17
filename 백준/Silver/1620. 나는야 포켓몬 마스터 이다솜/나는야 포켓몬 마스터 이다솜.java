import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Integer,String> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();

        // 첫 번째 줄 입력
        String firstLine = br.readLine();
        StringTokenizer st = new StringTokenizer(firstLine, " ");
        int n = Integer.parseInt(st.nextToken());  // 첫 번째 정수 (26)
        int m = Integer.parseInt(st.nextToken());  // 두 번째 정수 (5)
        for(int j=1; j<=n; j++){
            String input = br.readLine();
            map1.put(j, input);
            map2.put(input, j);
        }

        for(int j=0; j<m; j++) {
            String find = br.readLine();
        if(StringInteger(find)) {
            System.out.println(map1.get(Integer.parseInt(find)));
        }
        else {
            System.out.println(map2.get(find));
        }
        }
    }
    public static boolean StringInteger(String str) {
        try {
            Integer.parseInt(str);  // 또는 Double.parseDouble(str) 등 사용 가능
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}