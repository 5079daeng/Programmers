class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] arr = s.toCharArray();
     
        for(int i = s.length()-1; i >= 0 ; i --) {
            answer[i] = -1;
            for( int k = i-1; k  >= 0; k--) {
                if(arr[i] == arr[k]) {
                    answer[i] = (i - k);  
                    break;
                }
            } 
        }
        return answer;
    }
}