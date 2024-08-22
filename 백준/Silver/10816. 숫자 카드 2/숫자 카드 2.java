import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int firstLine = Integer.valueOf(br.readLine());
        String secondLine = br.readLine();
        int thirdLine = Integer.valueOf(br.readLine());
        String fourthLine = br.readLine();

        StringTokenizer st = new StringTokenizer(secondLine, " ");

        HashMap<String, Integer> map1 = new HashMap<>();

        for (int i = 0; i < firstLine; i++) {
            String num = st.nextToken();
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        }

        st = new StringTokenizer(fourthLine, " ");

        for (int i=0; i < thirdLine; i++) {
            String num = st.nextToken();
            if(map1.get(num) == null) {
                System.out.print("0" + " ");
            }
            else System.out.print(map1.get(num) + " ");
        }


    }
}
