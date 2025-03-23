import java.util.*; 

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
      Stack<Integer> s = new Stack<>(); 
        
        for(int move : moves) {
           for(int i = 0 ; i <board.length​; i ++) {
               if(board[i][move-1] != 0) {
                 int target = board[i][move-1];
                   if(!s.isEmpty() && s.peek() == target) {
                       s.pop();
                       answer+= 2;
                   } else {
                       s.push(target);
                   }
                   board[i][move-1] = 0; 
                   break;
               }
           }
            
        }  
           
        return answer;
    }
}
