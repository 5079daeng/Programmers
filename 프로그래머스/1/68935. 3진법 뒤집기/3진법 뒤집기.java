class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(); 
       
        while (n >= 1) {
            sb.append(n % 3);
            n /= 3;
        }
        sb.reverse();
        
        int start = 1; 
        for(int i = 0 ; i < sb.length(); i++) {
           answer += ((sb.charAt(i) -'0') * start);
           start *= 3;
            
        }
        return answer;
    }
}