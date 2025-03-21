import java.util.*;
class Solution {
    public int solution(int[] nums) {
       Set set = new HashSet<>();
        
        for(int n : nums) {
            set.add(n);
        }
        
        return set.size() < nums.length /2 ? set.size() : nums.length /2;
    }
}