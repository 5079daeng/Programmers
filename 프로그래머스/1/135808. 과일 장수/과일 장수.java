import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
      int answer = 0;
        
      int[] sortedDesc = Arrays.stream(score)
                         .boxed() 
                         .sorted(Comparator.reverseOrder())
                         .mapToInt(Integer::intValue) 
                         .toArray();
        
        Boolean  b = true; 
        int idx = 0;
        while (b) {
    
         int arr[] =  Arrays.copyOfRange(sortedDesc,idx, idx +m);
         int min =  Arrays.stream(arr).min().getAsInt(); 
            answer += (m * min);
            if(idx + m > score.length) {
                b = false; 
            } else {
                 idx += m; 
            }
        }
        
        return answer;
    }
}