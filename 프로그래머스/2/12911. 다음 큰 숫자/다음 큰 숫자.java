class Solution {
    public int solution(int n) {
        String binary = Integer.toBinaryString(n);
        String tempbinary;
        int count1 = 0;
        int count2 = 0;
    
        for(int i=0; i<binary.length(); i++) {
            if(binary.charAt(i) == '1') count1++;
        }
        
        while(true) {
            count2 = 0;
            n++;
            tempbinary = Integer.toBinaryString(n);
            for(int i=0; i<tempbinary.length(); i++) {
                if(tempbinary.charAt(i) == '1') count2++;
            }
                if(count2 == count1) break;
        }
        
        return n;
    }
}