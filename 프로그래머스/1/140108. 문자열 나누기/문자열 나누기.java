class Solution {
    public int solution(String s) {
        int answer = 0;
        int chk = 0;
        char first = s.charAt(0);

        for(int i = 0; i < s.length(); i++) {
            if(chk == 0) { 
                first = s.charAt(i);
                answer++;
            }
            
            if(first == s.charAt(i)) chk++;
            else chk--;
        }

        return answer;
    }
}
