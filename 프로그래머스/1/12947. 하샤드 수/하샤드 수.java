class Solution {
    public boolean solution(int x) {
        int org = x;
        int sum = 0;
        
        while( x > 0 ) {
          sum +=  (x % 10);
          x /=10;
        }
        
        return  org % sum == 0 ? true : false;
    
    }
}