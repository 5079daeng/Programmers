
import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) {
            return new int[]{-1};
        }
        int min = Arrays.stream(arr).min().getAsInt(); // OptionalInt가 나와서 getAsInt 필수
        return Arrays.stream(arr).filter(c ->  c != min).toArray();
        }
}