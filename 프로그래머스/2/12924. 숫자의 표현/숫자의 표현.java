class Solution {
    public int solution(int n) {
        int answer = 0;
        int start = 1; 
        int idx = 1; 
        int sum = 0;       
         while(start <= n) {
       
            sum += start;
             
            if(sum == n) {
                
                answer += 1; 
               
                idx += 1; 
                start = idx; 
                sum = 0;
            } else if (sum > n ){
               
                idx += 1; 
                start = idx; 
                sum = 0;
                
            } else {
               start ++; 
            }
         
             
         }
        return answer;
    }
}