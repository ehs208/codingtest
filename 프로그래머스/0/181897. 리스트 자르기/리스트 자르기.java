import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> list = new ArrayList<>();
        int length = num_list.length;
        switch (n) {
            case 1: 
                for(int i=0; i<=slicer[1]; i++) {
                    list.add(num_list[i]);
                }
                break;
            case 2:
                for(int i=slicer[0]; i<length; i++)  {
                    list.add(num_list[i]);
                }
                break;
            case 3:
                for(int i=slicer[0]; i<=slicer[1]; i++) {
                    list.add(num_list[i]);
                }
                break;
            case 4:
                for(int i=slicer[0]; i<=slicer[1]; i+=slicer[2]) {
                    list.add(num_list[i]);
                }
                break;
        }
        
        int[] answer = new int[list.size()];
        
        for(int k=0; k<list.size(); k++) {
            answer[k] = list.get(k);
        }
        
        return answer;
    }
}