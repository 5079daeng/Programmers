import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
       
        //스택 쓰라고 했음 
        Stack<Integer> stack = new Stack<>(); 
        for (int num : arr) {
            if (stack.isEmpty() || stack.peek() != num) { 
                stack.push(num);
            }
        }
        
        return stack.stream().mapToInt(Integer::intValue).toArray(); 
        
    }
}