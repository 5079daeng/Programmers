class Solution {
    public long solution(long n) {
        long answer = 0;
        
       String srt = String.valueOf(n); 
       StringBuilder sb = new StringBuilder(srt);
        
        for(int i = 0 ; i < sb.length(); i++) {
            for(int j = i+1; j < sb.length(); j++) {
                 if(((int) sb.charAt(i)) < ((int) sb.charAt(j))) {
                char temp =sb.charAt(i);
                sb.setCharAt(i,sb.charAt(j));
                sb.setCharAt(j,temp);
                
            }
        }
           
        }
       
     return  Long.valueOf(sb.toString());
        
    }
}