import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
       
        String[] distinctReport = Arrays.stream(report).distinct().toArray(String[]::new);

        HashMap<String, Integer> map2 = new HashMap<>();
        for(int i = 0; i < id_list.length; i++) {
            map2.put(id_list[i], i);
        }

        HashMap<String, List<String>> map = new HashMap<>();
        for(String id : id_list) {
            map.put(id, new ArrayList<>());
        }

        for(String str : distinctReport) {
            String[] tmp = str.split(" ");
            String from = tmp[0]; 
            String to = tmp[1];  
            map.get(to).add(from); 
        }

    
        List<Integer> list = new ArrayList<>(Collections.nCopies(id_list.length, 0));
        for(String id : id_list) {
            if (map.get(id).size() >= k) {
                for(int i = 0; i < map.get(id).size(); i++) {
                    int idx = map2.get(map.get(id).get(i));
                    list.set(idx, list.get(idx) + 1); 
                }
            } 
        }

        return list.stream().mapToInt(c -> c).toArray();
    }
}
