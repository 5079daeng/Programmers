import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] players = new int[N + 2]; 
        int total = stages.length; 

        for (int stage : stages) {
            players[stage]++;
        }

        List<double[]> failRates = new ArrayList<>();
        int remainPlayers = total; 
        for (int i = 1; i <= N; i++) {
            
            if (remainPlayers == 0) {
                failRates.add(new double[]{i, 0.0});
                
            } else {
                
                double failRate = (double) players[i] / remainPlayers;
                failRates.add(new double[]{i, failRate});
                remainPlayers -= players[i]; 
            }
        }

       
        failRates.sort((a, b) -> b[1] == a[1] ? Double.compare(a[0], b[0]) : Double.compare(b[1], a[1]));


        return failRates.stream().mapToInt(a -> (int) a[0]).toArray();
    }
}
