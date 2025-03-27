import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int n = friends.length;
        Map<String, Integer> idxMap = new HashMap<>();
        for (int i = 0; i < n; i++) idxMap.put(friends[i], i);

        int[][] giftMatrix = new int[n][n];
        int[] giftScores = new int[n];

        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            int from = idxMap.get(parts[0]);
            int to = idxMap.get(parts[1]);

            giftMatrix[from][to]++;
            giftScores[from]++;
            giftScores[to]--;
        }

        int[] nextMonth = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (giftMatrix[i][j] > giftMatrix[j][i]) {
                    nextMonth[i]++;
                } else if (giftMatrix[i][j] < giftMatrix[j][i]) {
                    nextMonth[j]++;
                } else {
                    if (giftScores[i] > giftScores[j]) {
                        nextMonth[i]++;
                    } else if (giftScores[i] < giftScores[j]) {
                        nextMonth[j]++;
                    }
                }
            }
        }

        int maxGifts = 0;
        for (int giftsCount : nextMonth) {
            maxGifts = Math.max(maxGifts, giftsCount);
        }

        return maxGifts;
    }
}