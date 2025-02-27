class Solution {
    boolean solution(String s) {
        int pCount = 0; 
        int yCount = 0;  

        s = s.toUpperCase();
    
        for(int i = 0 ; i < s.length(); i ++) {
            
            if(s.charAt(i) =='P') {
                pCount++;
            }  
            if (s.charAt(i) =='Y'){
                yCount++;
            }       
        }
        
       return pCount == yCount ? true : false; 

    }
}