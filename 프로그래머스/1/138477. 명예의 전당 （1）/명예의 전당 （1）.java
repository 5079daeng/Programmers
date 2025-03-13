import java.util.*;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int k, int[] score) {

    List<Integer> list = new ArrayList<>();
     return   IntStream.range(0, score.length).map(i -> {
           
           list.add(score[i]);
           Collections.sort(list, Collections.reverseOrder());
            if (i <=k-1) {
                return list.get(i);
            } else {
                return list.get(k-1);
            }
            
        }).toArray();
  
    }
}