import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        Map<String, Integer> colIdx = new HashMap<>();
        colIdx.put("code", 0);
        colIdx.put("date", 1);
        colIdx.put("maximum", 2);
        colIdx.put("remain", 3);

        int extIdx = colIdx.get(ext);
        int sortIdx = colIdx.get(sort_by);

        List<int[]> filtered = new ArrayList<>();
        for (int[] d : data) {
            if (d[extIdx] < val_ext) {
                filtered.add(d);
            }
        }

        filtered.sort(Comparator.comparingInt(o -> o[sortIdx]));

        return filtered.toArray(new int[filtered.size()][]);
    }
}
