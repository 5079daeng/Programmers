class Solution {
    public String solution(String s) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
       int idx = 0; 
        for( char c : s.toCharArray()) {
            if( c == ' ') {
                sb.append(c);
                idx = 0;
                
            } else {
                sb.append(idx % 2 == 0 ? Character.toUpperCase(c) : Character.toLowerCase(c));
                idx ++; 
            }
        }
        
        return sb.toString();
    }
}