import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int last = 0; 

        for (int sec : section) {
            if (sec > last) { 
                answer++; 
                last = sec + m - 1; 
            }
        }

        return answer;
    }
}
