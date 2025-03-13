import java.util.Arrays;
import java.util.HashMap;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length]; 
        
        int sum = 0 ; 
        HashMap<String,Integer> hash = new HashMap<>(); 
        
        for(int i = 0 ; i < name.length; i ++) {
           hash.put(name[i],yearning[i]); 
        }
      
      for(int i = 0 ; i < photo.length; i ++) {
             sum =0; 
             for(int j = 0 ; j < photo[i].length; j ++) {
                String innerName =  photo[i][j] ;  
                 Integer point = hash.get(innerName); 
         if(point != null) { 
             sum += point;  
         }
             answer[i] = (int) sum;
         } 
      }
         
        return answer;
    }
}