import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>(); 

        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[]{priorities[i], i});
        }

        int answer = 0;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();

            boolean hasBigger = queue.stream().anyMatch(x -> x[0] > curr[0]);

            if (hasBigger) {
                queue.add(curr); 
            } else {
                answer++; 

                if (curr[1] == location) {
                    return answer; 
                }
            }
        }

        return answer;
    }
}
