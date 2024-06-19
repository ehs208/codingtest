class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        
        int size1 = intervals[0][1] - intervals[0][0] + 1;
        int size2 = intervals[1][1] - intervals[1][0] + 1;
        int list1[] = new int[size1];
        int list2[] = new int[size2];
        int answer[] = new int[size1 + size2];
        
        int k=intervals[0][0];
        int j=intervals[1][0];
        
        for(int i=0;i<size1;i++) {
            answer[i] = arr[k];
            k++;
        }
        for(int i=size1;i<answer.length;i++) {
            answer[i] = arr[j];
            j++;
        }
        
        return answer;
    }
}