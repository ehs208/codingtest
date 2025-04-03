import java.util.*;
import java.io.*;

/*
    BAEKJOON 11501번 주식
    https://www.acmicpc.net/problem/11501
*/

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<ArrayList<Integer>> prices = new ArrayList<>();

        int T = Integer.valueOf(st.nextToken());

        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int day = Integer.valueOf(st.nextToken());

            st = new StringTokenizer(br.readLine());

            ArrayList<Integer> dayPrices = new ArrayList<>();
            for(int j = 0; j < day; j++) {
                int price = Integer.parseInt(st.nextToken());
                dayPrices.add(price);
            }

            prices.add(dayPrices);
        }



        for(int i=0; i< T; i++) {
            bw.write(String.valueOf(stock(prices.get(i))));
            bw.write("\n");
        }


        bw.flush();
        bw.close();
        br.close();
    }

    public static long stock(ArrayList<Integer> stock) {
        long benefit = 0;
        int maxPrice = 0;
        for(int i=stock.size() -1; i>=0; i--) {
            if(stock.get(i) > maxPrice) {
                maxPrice = stock.get(i);

            }
            else {
                benefit += maxPrice - stock.get(i);
            }
        }

        return benefit;
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
