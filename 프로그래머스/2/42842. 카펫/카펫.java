class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int height = 0; //세로
        int width = 0; //가로
        
        int total = brown + yellow;
        while(true) {
            height++;
            width = total / height;
            if(width >= height && height * width == total && (width * 2 + height * 2 - 4) == brown)
                break;
        }
        return new int[] {width, height};
    }
}