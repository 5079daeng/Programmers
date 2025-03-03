import java.util.stream.Collectors;
import java.util.Comparator;

class Solution {
    public String solution(String s) {
        return s.chars() // 문자열 int 스트림
                .mapToObj(c -> String.valueOf((char) c)) // int > char > String
                .sorted(Comparator.reverseOrder()) // 내림차순 정렬 
                .collect(Collectors.joining()); // toString과 같은 기능 
    }
}
