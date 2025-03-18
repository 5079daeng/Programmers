import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        for (int i = 0; i < targets.length; i++) {
            for (char c : targets[i].toCharArray()) {
             
                int minIndex = Arrays.stream(keymap).filter(obj -> obj.contains(String.valueOf(c)))
                        .mapToInt(obj -> obj.indexOf(c)).min().orElse(-1); 

                if (minIndex == -1) {
                    answer[i] = -1; 
                    break;
                }

                answer[i] += minIndex + 1; 
            }
        }
        return answer;
    }
}
