import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int i : ingredient){
            stack.push(i);
            
            if(stack.size() >= 4){
                int n = stack.size();
                if(stack.get(n-1) == 1 &&
                   stack.get(n-2) == 3 &&
                   stack.get(n-3) == 2 &&
                   stack.get(n-4) == 1){
                    
                    answer++;
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
            }
        }
        
        return answer;
    }
}
