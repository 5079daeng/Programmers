import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int maxSquare = findLargestAvailableSquare(park);
        return findOptimalMat(mats, maxSquare);
    }

    private int findLargestAvailableSquare(String[][] park) {
        int rows = park.length;
        int cols = park[0].length;
        int[][] dp = new int[rows][cols];
        int maxSize = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (park[i][j].equals("-1")) {
                    dp[i][j] = (i == 0 || j == 0) ? 1 : Math.min(
                        Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    maxSize = Math.max(maxSize, dp[i][j]);
                }
            }
        }
        return maxSize;
    }

    private int findOptimalMat(int[] mats, int maxSquare) {
        Arrays.sort(mats);
        for (int i = mats.length - 1; i >= 0; i--) {
            if (mats[i] <= maxSquare) {
                return mats[i];
            }
        }
        return -1;
    }
}


