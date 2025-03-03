class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder(); // 문자열에서 += 연산을 하는 경우 StringBuilder 사용하는 것이 효율적 

        sb.append("*".repeat(phone_number.length() - 4));
        sb.append(phone_number.substring(phone_number.length() - 4));

        return sb.toString();
    }
}
