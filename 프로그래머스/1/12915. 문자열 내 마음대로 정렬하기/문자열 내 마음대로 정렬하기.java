class Solution {
    public String[] solution(String[] strings, int n) {
        for(int i = 0; i < strings.length - 1; i++) {
            for(int j = 0; j < strings.length - 1 - i; j++) {
                if(strings[j].charAt(n) > strings[j+1].charAt(n)) {
                    String temp = strings[j];
                    strings[j] = strings[j+1];
                    strings[j+1] = temp;
                } else if(strings[j].charAt(n) == strings[j+1].charAt(n)){
                    if(strings[j].compareTo(strings[j+1]) > 0) {
                        String temp = strings[j];
                        strings[j] = strings[j+1];
                        strings[j+1] = temp;
                    }
                }
            }
        }
        return strings;
    }
}
