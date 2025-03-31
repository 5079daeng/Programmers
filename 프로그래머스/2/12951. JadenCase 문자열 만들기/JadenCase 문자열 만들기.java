class Solution {
    public String solution(String s) {
   
        String[] arr = s.split(" "); 
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < arr.length; i++) {
           if(arr[i].length() == 0) {
               sb.append(" ");
           } else {
             String str = arr[i].substring(0, 1).toUpperCase() +arr[i].substring(1).toLowerCase();
             sb.append(str);
           }

            if(i != arr.length -1) sb.append(" ");
        }
        
        return sb.toString();
        
        }
}
