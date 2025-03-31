import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<String> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            String ch = String.valueOf(s.charAt(i));
            st.push(ch);

            if (st.size() >= 2) {
                String top = st.peek();
                String underTop = st.get(st.size() - 2);

                if (underTop.equals("(") && top.equals(")")) {
                    st.pop(); 
                    st.pop(); 
                }
            }
        }

        return st.isEmpty();
    }
}
