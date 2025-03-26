class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int currentHealth = health;
        int maxHealth = health;
        int time = 0;
        int attackIdx = 0;
        int combo = 0;

        int endTime = attacks[attacks.length - 1][0];

        for(time = 1; time <= endTime; time++) {
            if(attacks[attackIdx][0] == time) {
                currentHealth -= attacks[attackIdx][1];
                combo = 0; 
                attackIdx++; 
            } else { 
                currentHealth += bandage[1]; 
                combo++;
                if(combo == bandage[0]) { 
                    currentHealth += bandage[2];
                    combo = 0; 
                }
                if(currentHealth > maxHealth) currentHealth = maxHealth; 
            }

            if(currentHealth <= 0) return -1; 
        }

        return currentHealth;
    }
}
