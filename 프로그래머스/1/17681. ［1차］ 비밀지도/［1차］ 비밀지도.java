import java.util.*; 

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
     String[] answer = new String[arr1.length];
        
       for(int i = 0 ; i < arr1.length; i ++){
           StringBuilder sb= new StringBuilder();
           
           int temp = arr1[i]|arr2[i]; 
           while(temp > 0) {
                sb.append(temp%2); 
               temp /=2;
              
           }
           sb.append("0".repeat(n- sb.length()));
           answer[i] = sb.reverse().toString().replace("1","#").replace("0"," "); 

       }
       
     return answer;
    }
}