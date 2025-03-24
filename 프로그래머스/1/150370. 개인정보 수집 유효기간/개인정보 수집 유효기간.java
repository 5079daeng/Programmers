import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> termMap = new HashMap<>();

        for (String term : terms) {
            String[] parts = term.split(" ");
            termMap.put(parts[0], Integer.parseInt(parts[1]));
        }

        int[] todayArr = Arrays.stream(today.split("\\.")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < privacies.length; i++) {
            String[] parts = privacies[i].split(" ");
            int[] privacyDate = Arrays.stream(parts[0].split("\\.")).mapToInt(Integer::parseInt).toArray();
            String termType = parts[1];

            privacyDate[1] += termMap.get(termType);
            privacyDate[2] -= 1;

            if (privacyDate[2] == 0) {
                privacyDate[2] = 28;
                privacyDate[1] -= 1;
            }

            if (privacyDate[1] > 12) {
                privacyDate[0] += (privacyDate[1] - 1) / 12;
                privacyDate[1] = (privacyDate[1] - 1) % 12 + 1;
            }

            if (isExpired(todayArr, privacyDate)) {
                list.add(i + 1);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    private boolean isExpired(int[] today, int[] date) {
        if (today[0] > date[0]) return true;
        if (today[0] == date[0] && today[1] > date[1]) return true;
        if (today[0] == date[0] && today[1] == date[1] && today[2] > date[2]) return true;
        return false;
    }
}
