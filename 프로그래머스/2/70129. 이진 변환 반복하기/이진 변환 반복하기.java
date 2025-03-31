class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        int length = 0 ;
        int cnt = 0 ;
        while(!"1".equals(s)) {
           int orgLength = s.length(); 
          s = s.replace("0", "");
          length  += (orgLength - s.length());
          s = String.valueOf(Integer.toBinaryString(s.length()));
          cnt ++; 
            
            
        }
        return new int[]{cnt, length};
    }
}