
class Solution {
    public boolean solution(String s) {
       if (s.length() != 4 && s.length() != 6) return false; 
        
        for (char c : s.toCharArray()) {
            if (c < '0' || c > '9') return false; // 아스키코드값
        }
        
        return true; 
    }
}