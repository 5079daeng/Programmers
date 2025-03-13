class Solution {
    public String solution(String s, int n) {

    StringBuilder sb = new StringBuilder(); 
        
      for(char c : s.toCharArray()) {
           if(c == ' ') {
               sb.append(c); 
           } else {
                int sum = c + n ; 
               // 대문자인 경우 
               if (Character.isUpperCase(c)) {
                  sb.append((char) ((c - 'A' + n) % 26 + 'A'));
               // 소문자인 경우 
               } else {
                   sb.append((char) ((c - 'a' + n) % 26 + 'a'));
               }
              
           }
      }
        return sb.toString();
    }
}