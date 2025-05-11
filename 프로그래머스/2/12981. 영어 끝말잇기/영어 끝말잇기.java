import java.util.*; 
class Solution {
    public int[] solution(int n, String[] words) {
    
        List<String> list = new ArrayList<>(); 
        list.add(words[0]); 
    
        for(int i = 1 ; i < words.length ; i++) {
            String prev = words[i -1];
            String curr = words[i];
            
            if(list.contains(curr) || 
               prev.charAt(prev.length()-1) != curr.charAt(0)){
                int person = (i) % n +1;
                int turn = (i) / n +1; 
          
                return new int[]{person,turn};
            }
            
            list.add(curr);

        }
        
        return new int[]{0,0};
    }
}