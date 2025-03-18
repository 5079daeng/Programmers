class Solution {
    public String solution(String s, String skip, int index) {
      String answer = "";
     
        for(char c : s.toCharArray()) {
             int cnt = 0; 
             while(cnt < index) {  
                 c++;  

                 if (c > 'z') {
                      c ='a';
                  } 
                 
               if(!skip.contains(String.valueOf(c))) {
                      cnt ++;
                }   
            
            }
        
           answer += String.valueOf(c);
         
       }
                    
       return answer;
    } 
}