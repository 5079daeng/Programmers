import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int solution(String dartResult) {

       List<Integer> list = new ArrayList<>(); 
       for(int i = 1; i < dartResult.length(); i++) {
           
        char c = dartResult.charAt(i); 
         
        int before = dartResult.charAt(i - 1) -'0';
        if(i >=2) {
        int fore = dartResult.charAt(i - 2) -'0';
          if(fore  == 1){
             before =  10;
          }
         }
        
      
         if(c == 'S') {
         list.add(before);
         } else if ( c == 'D') {
         list.add(before * before);
         } else if ( c == 'T') {
         list.add(before * before * before);
         } else if (c == '*') {
            if(list.size() >=2) {
                list.set(list.size()-2,list.get(list.size()-2)*2); 
             }
           list.set(list.size()-1,list.get(list.size()-1)*2); 
         } else if (c == '#') {
           list.set(list.size()-1,list.get(list.size()-1)*-1); 
         }
             
     } 
        
       return list.stream().mapToInt(d-> d).sum();
        
    }
}