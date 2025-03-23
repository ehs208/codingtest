import java.util.*;

class Solution {
    public int solution(int N, int number) {
        
        HashSet<Integer>[] sets = new HashSet[9];
        
        for (int i = 1; i <= 8; i++) {
            sets[i] = new HashSet<>();
        }
        
        for (int i = 1; i <= 8; i++) {
            int concatenated = 0;
            for (int j = 0; j < i; j++) {
                concatenated = concatenated * 10 + N;
            }
            sets[i].add(concatenated);
            
            if (i == 1 && concatenated == number) {
                return 1;
            }
        }
        

        for (int i = 2; i <= 8; i++) {
            for (int j = 1; j < i; j++) {
                for (int a : sets[j]) {
                    for (int b : sets[i-j]) {
                    sets[i].add(a + b);
                    sets[i].add(a - b);
                    sets[i].add(a * b);
                    if (b != 0) sets[i].add(a / b);
            }
        }
    }
    

        if (sets[i].contains(number)) {
            return i;
        }
    }
        

        return -1;
    }
}