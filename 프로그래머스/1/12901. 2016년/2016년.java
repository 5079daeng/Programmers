class Solution {
    public String solution(int a, int b) {
        String[] days = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] monthDays = {31,29,31,30,31,30,31,31,30,31,30,31}; 
        
        int cnt = 0;
        for(int i = 0; i < a - 1; i++) {
            cnt += monthDays[i];
        }
        cnt += b - 1; 
        
        return days[cnt  % 7];
    }
}