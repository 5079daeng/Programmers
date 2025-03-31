class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean start = true;

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append(c);
                start = true; 
            } else {
                if (start) {
                    sb.append(Character.toUpperCase(c));
                    start = false;
                } else {
                    sb.append(Character.toLowerCase(c));
                }
            }
        }

        return sb.toString();
    }
}

