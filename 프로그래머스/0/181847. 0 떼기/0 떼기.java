class Solution {
    public String solution(String n_str) {
        String answer = "";
        String temp = "";
        StringBuilder sb = new StringBuilder();
        int i = 0;
        
        if(n_str.charAt(i) != '0') {
            answer = n_str;
        }
        
        else {
            while(true) {
                temp = String.valueOf(n_str.charAt(i));
                if(Integer.parseInt(temp) != 0)
                    break;
                else
                    i++;
            }
        
        for(int k=i; i<n_str.length(); i++) {
            sb.append(n_str.charAt(i));
        }
        
        answer = sb.toString();
        }
        return answer;
    }
}