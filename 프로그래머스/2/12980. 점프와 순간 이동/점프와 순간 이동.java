class Solution {
    public int solution(int n) {
        int bat = 0;

        while (n > 0) {
            if (n % 2 == 0) {
                n /= 2; 
            } else {
                n -= 1; 
                bat++; 
            }
        }

        return bat;
    }
}
