import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>(); 
        
        for(int n : arr) {
            if(n % divisor == 0) list.add(Integer.valueOf(n));
        } 
   
        if (list.size() == 0)  list.add(-1);
          
        return list.stream().sorted().mapToInt(Integer::intValue).toArray();
        
    }
}