class Solution {
    int answer = 0;
    boolean[] isVisited;

    public int solution(int k, int[][] dungeons) {
        isVisited = new boolean[dungeons.length]; 

        dfs(k, 0, dungeons);
        return answer;
    }

    void dfs(int k, int count, int[][] dungeons) {
        answer = Math.max(answer, count);

        for (int i = 0; i < dungeons.length; i++) {
            if (!isVisited[i] && k >= dungeons[i][0]) {
                isVisited[i] = true;
                dfs(k - dungeons[i][1], count + 1, dungeons); 
                isVisited[i] = false; 
            }
        }
    }
}
