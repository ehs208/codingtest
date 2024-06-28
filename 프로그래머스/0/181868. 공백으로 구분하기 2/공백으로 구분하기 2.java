class Solution {
    public String[] solution(String my_string) {
        String temp = my_string.replaceAll("\\s+(?=\\s)", "").trim();
        System.out.println("..");
        String[] answer = temp.split(" ");
        return answer;
    }
}