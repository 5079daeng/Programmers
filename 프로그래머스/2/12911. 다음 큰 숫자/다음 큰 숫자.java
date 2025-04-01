class Solution {
    public int solution(int n) {
        int answer = 0;

        String bi = Integer.toBinaryString(n);
        String cnt = bi.replace("0","");
        int oneCnt = cnt.length(); 
        boolean b = true; 
        int target = n + 1; 
        
         while(b) {
          String targetBi = Integer.toBinaryString(target);
          String targetCnt = targetBi.replace("0","");
          int targetOneCnt = targetCnt.length(); 
             if(oneCnt == targetOneCnt) {
                 answer = target;
                 b = false; 
             } else {
                 target +=1;
             }
         }
    
        return answer;
    }
}