class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int count = 0;

        for (int i = 0; i < schedules.length; i++) {
            int day = startday;
            boolean isWinner = true;

            for (int j = 0; j < 7; j++) {
                if (day < 6) {
                    int scheduleTime = 0 ;
                    int arriveTime = timelogs[i][j];
                    if(schedules[i] % 100 >=50){
                        scheduleTime = (schedules[i] / 100  +1 ) * 100 + (schedules[i]% 100 + 10) % 60; 
               
                    } else {
                        scheduleTime = schedules[i] + 10;
                    }
                   

                    if (arriveTime > scheduleTime) {
                        isWinner = false;
                        break;
                    }
                }

                day = day % 7 + 1;
            }

            if (isWinner) count++;
        }

        return count;
    }
}
