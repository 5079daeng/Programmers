import java.util.*;
class Solution {
    public long[] solution(int x, int n) {
        List<Long> list = new ArrayList<>(); 
        
        int idx = 1;
        while(idx <= n) {
            list.add(Long.valueOf(x) * idx);
            idx++; 
        }
      return list.stream().mapToLong(c->c).toArray();
    
    }
}