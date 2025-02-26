class Solution {
    public long solution(int a, int b) {
     long answer = 0; 
        
        if(a == b) {
            answer = a;
        } else {
            int max = Math.max(a,b);
            int min = Math.min(a,b); 

            while(min <= max) {
              answer += min;
              min ++;
            }
        } 
        
        return answer; 
        
    }
}