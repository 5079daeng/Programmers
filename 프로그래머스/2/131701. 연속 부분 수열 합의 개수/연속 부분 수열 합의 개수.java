import java.util.*; 
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        // 1. 원형수열이기 때문에 똑같은 배열을 합쳐서 길이를 2배로 만들어준다 
        int n = elements.length;
        int[] doubleEl = new int[n * 2]; 
        for (int i = 0; i < n * 2; i++) {
            doubleEl[i] = elements[i % n];
        }
        
        // 2. 누적 합을 구해서 Set에 담는다  
        Set<Integer> set = new HashSet<>(); 
        for(int i = 1 ; i <= elements.length ; i++) {
            for(int start = 0 ; start < elements.length; start ++ ) {
                int sum = 0; 
                for(int k = start ; k < start+i; k ++) {
                    sum += doubleEl[k]; 
                }
                set.add(sum);
            }      
        
        }    
        
        return set.size();
    }
}