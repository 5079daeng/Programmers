class Solution {
    public int solution(int[] arr) {
        int answer = arr[0]; 
        
        for(int i = 0; i < arr.length ; i ++) {
            answer= lcm(arr[i], answer); 
        }
        
        return answer;
        
    }
    
    public int lcm(int a , int b) {
        
        return (a*b) / gcd(a,b);
    }
    public int gcd (int a , int b) {
        while(b != 0 ) {
  
        int temp = a%b; 
        a = b;
        b = temp ;
        
        } return a;
    }
}
