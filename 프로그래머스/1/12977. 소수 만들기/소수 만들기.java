class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i + 1; j < nums.length - 1; j++){
                for(int k = j + 1; k < nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];

                    boolean isPrime = true;
                    if(sum < 2) isPrime = false;
                    
                    for(int n = 2; n * n <= sum; n++) {
                        if(sum % n == 0) {
                            isPrime = false;
                            break;
                        }
                    }

                    if(isPrime) answer++;
                }
            }
        }

        return answer;
    }
}
