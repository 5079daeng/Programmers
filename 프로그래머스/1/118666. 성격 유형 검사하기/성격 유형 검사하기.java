import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "RCJA";
        
       Map<Integer,Integer> map = new HashMap<>();
        map.put(1, 3);
        map.put(2, 2);
        map.put(3, 1);
        map.put(4, 0);
        map.put(5, 1);
        map.put(6, 2);
        map.put(7, 3);
        
        Map<String,Integer> score = new HashMap<>(); 
        score.put("R", 0);
        score.put("T", 0);
        score.put("C", 0);
        score.put("F", 0);
        score.put("J", 0);
        score.put("M", 0);
        score.put("A", 0);
        score.put("N", 0);
        
      for (int i = 0 ; i < survey.length; i ++) {
        if("RT".equals(survey[i])) { if (choices[i] < 4) { score.put("R", score.get("R") + map.get(choices[i])); } else { score.put("T", score.get("T") + map.get(choices[i]));}} 
        if("TR".equals(survey[i])) { if (choices[i] < 4) { score.put("T", score.get("T") + map.get(choices[i])); } else { score.put("R", score.get("R") + map.get(choices[i]));}}
        if("CF".equals(survey[i])) { if (choices[i] < 4) { score.put("C", score.get("C") + map.get(choices[i])); } else { score.put("F", score.get("F") + map.get(choices[i]));}}
        if("FC".equals(survey[i])) { if (choices[i] < 4) { score.put("F", score.get("F") + map.get(choices[i])); } else { score.put("C", score.get("C") + map.get(choices[i]));}}
        if("JM".equals(survey[i])) { if (choices[i] < 4) { score.put("J", score.get("J") + map.get(choices[i])); } else { score.put("M", score.get("M") + map.get(choices[i]));}}
        if("MJ".equals(survey[i])) { if (choices[i] < 4) { score.put("M", score.get("M") + map.get(choices[i])); } else { score.put("J", score.get("J") + map.get(choices[i]));}}
        if("AN".equals(survey[i])) { if (choices[i] < 4) { score.put("A", score.get("A") + map.get(choices[i])); } else { score.put("N", score.get("N") + map.get(choices[i]));}}
        if("NA".equals(survey[i])) { if (choices[i] < 4) { score.put("N", score.get("N") + map.get(choices[i])); } else { score.put("A", score.get("A") + map.get(choices[i]));}}
       }
        
      StringBuilder sb = new StringBuilder(answer);
	       if (score.get("R") < score.get("T")) {
            sb.setCharAt(0, 'T');
        } 
         
        if (score.get("C") < score.get("F")) {
            sb.setCharAt(1, 'F');
        } 
       
        if (score.get("J") < score.get("M")) {
             sb.setCharAt(2, 'M');
        } 
         
        if (score.get("A") < score.get("N")) {
             sb.setCharAt(3, 'N');
        } 
        
        return sb.toString();
    }
}