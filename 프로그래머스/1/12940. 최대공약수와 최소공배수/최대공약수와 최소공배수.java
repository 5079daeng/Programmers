class Solution {
    public int[] solution(int n, int m) {
        int product = n*m; 
        
        //  최대공약수 구하는 법
        while(m != 0) {
            int temp = m;
            m = n % m;
            n = temp;
          } 
        // 최소공배수 : 두수의 곱 / 최대공약수
        return new int[]{n, product/n};
    }
}