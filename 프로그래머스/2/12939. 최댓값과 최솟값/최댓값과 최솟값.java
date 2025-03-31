import java.util.*; 
class Solution {
    public String solution(String s) {

        String[] arr = s.split(" ");
        
        int a = Arrays.stream(arr)
              .mapToInt(Integer::parseInt)
              .max()
              .getAsInt();
        
        int b = Arrays.stream(arr)
              .mapToInt(Integer::parseInt)
              .min()
              .getAsInt();
        
        return b + " "+ a;
    }
}