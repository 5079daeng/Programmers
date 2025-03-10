import java.util.*;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
     
      return IntStream.range(0,commands.length)
          .map(i -> {
               int[] slicedArr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
               Arrays.sort(slicedArr);
              return slicedArr[commands[i][2]-1];
          }).toArray();
    }
}