class Solution {
    
    int target;
    int answer = 0;
    int[] numbers;
    
    public int solution(int[] numbers, int target) {
       
        this.numbers = numbers;
        this.target = target;
        
        dfs(0, 0);
        
        return answer;
    }
    
    public void dfs(int index, int sum) {
        if(sum == target && index == numbers.length) {
            answer++;
            return;
        }
        
        if(index == numbers.length) {
            return;
        }
        
        int plus = sum + numbers[index];
        int minus = sum - numbers[index];
        
        dfs(index+1, plus);
        dfs(index+1, minus);
        

        }
    }
