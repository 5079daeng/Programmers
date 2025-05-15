import java.util.*; 
class Solution {
    public int solution(int[] citations) {
        int hIndex = 0;
        Arrays.sort(citations); // 오름차순 정렬 
        
        for(int i = 0; i < citations.length; i ++) {
              if (citations[i] >= citations.length - i) {
              hIndex = citations.length - i; 
              break;
             }
        }
        return hIndex;
    }
}