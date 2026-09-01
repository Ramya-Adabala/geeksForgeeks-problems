
class Solution {
     int lastWordLen(String s) {

         int n = s.length();
         int count = 0;

         for(int i=n-1; i>=0; i--) {
             char ch = s.charAt(i);
             if(ch != ' ') count++;
             else {
                 if(count > 0) return count;
             }
         }

         return count;
     }
 }