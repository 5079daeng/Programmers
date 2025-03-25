import java.util.*;
class Solution {
    public int[] solution(String[] park, String[] routes) {
 
       String[][] parks = new String[park.length][park[0].length()]; 
        
       for(int i = 0 ; i < park.length; i ++) {
           parks[i] = park[i].chars().mapToObj(c -> String.valueOf((char)c)) .toArray(String[]::new);
       }
        int[] arr = new int[2];
        for(int i = 0 ; i < parks.length ; i ++) {
        for(int j = 0 ; j < parks[0].length ; j ++) {
            if(parks[i][j].equals("S")) {
                arr[0] = i;
                arr[1] =j; 
                break;
            }
        }}
 
      for (String str : routes) {
          
          String direction = str.split(" ")[0];
          int length = Integer.parseInt(str.split(" ")[1]);

          boolean canMove = true;
    
          for (int i = 1; i <= length; i++) {
              int nx = arr[0];
              int ny = arr[1];

              if (direction.equals("N")) nx -= i;
              if (direction.equals("S")) nx += i;
              if (direction.equals("W")) ny -= i;
              if (direction.equals("E")) ny += i;

              if (nx < 0 || nx >= parks.length || ny < 0 || ny >= parks[0].length) {
                  canMove = false;
                  break;
              }

              if (parks[nx][ny].equals("X")) {
                  canMove = false;
                  break;
              }
          }

          if (canMove) {
              if (direction.equals("N")) arr[0] -= length;
              if (direction.equals("S")) arr[0] += length;
              if (direction.equals("W")) arr[1] -= length;
              if (direction.equals("E")) arr[1] += length;
          }
      }

        
        return arr;
    }
}