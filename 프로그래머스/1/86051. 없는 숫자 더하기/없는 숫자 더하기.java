import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        List<Integer> list = Arrays.stream(numbers)
                                   .boxed() // int -> Integer 변환
                                   .collect(Collectors.toList()); // 16 버전 이상에서는 toList() 사용 가능 

        for (int i = 0; i < 10; i++) {
            if (!list.contains(i)) { 
                answer += i;
            }
        }
        return answer;
    }
}
