class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] pronunciations = { "aya", "ye", "woo", "ma" };
        
        for (String s : babbling) {
            if (check(s, pronunciations)) {
                answer++;
            }
        }
        return answer;
    }

    public boolean check(String target, String[] pronunciations) {
        for (String p : pronunciations) {
           
            if (target.contains(p.repeat(2))) {
                return false;
            }
        }
        
        String replaced = target;
        for (String p : pronunciations) {
            replaced = replaced.replace(p, " ");
        }
 
        return replaced.trim().isEmpty();
    }
}
