class Solution {
    public String solution(int n) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder(); 
        answer = n % 2 == 0 
            ? sb.append("수박".repeat(n/2)).toString() 
            : sb.append("수박".repeat(n/2)).append("수").toString();
       
        return answer;
    }
}