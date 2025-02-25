import java.util.Arrays;
class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        answer =  (double) Arrays.stream(arr).sum() / arr.length; // sum() : 정수 반환 
        //  Arrays.stream(arr).average() : OptionalDouble 반환하기 때문에 .getAsDouble() 
        //  또는 .orElse(0); 해주어야함
        return answer;
    }
}