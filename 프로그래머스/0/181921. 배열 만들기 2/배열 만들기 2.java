import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int l, int r) {
        String temp = "";
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
            for(int j=l; j<=r; j++) {
                sum = 0;
                temp = Integer.toString(j);
                if(temp.matches("[05]+")) {
                    list.add(j);
                }
                }
            
                  
            if(list.isEmpty()) {
                list.add(-1);
        }

            return list;
}
}