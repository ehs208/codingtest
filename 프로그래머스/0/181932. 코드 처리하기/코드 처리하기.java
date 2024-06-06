class Solution {
    public String solution(String code) {
        
        int mode = 0;
        StringBuilder ret = new StringBuilder();
        
        char[] arr = code.toCharArray();
        
        for (int i=0; i<arr.length;i++) {
            if(mode == 0) {
                if(arr[i] == '1') {
                    mode = 1;
            }
            else {
                if(i % 2 == 0) {
                    ret.append(arr[i]);
                }
            }
        }
            else {
                if(arr[i] == '1') {
                    mode = 0;
                }
                else
                    if(i % 2 ==1) {
                        ret.append(arr[i]);
                    }
                
        }
        }
        
        String answer = ret.toString();
        if (answer.equals("")) {
            return "EMPTY";
        }
        else {
            return answer;
        }
    }
}