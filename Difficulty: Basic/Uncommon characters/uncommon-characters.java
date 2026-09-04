
class Solution {
     String uncommonChars(String s1, String s2) {
         HashSet<Character> hs1 = new HashSet<>();
         HashSet<Character> hs2 = new HashSet<>();

         for (char ch : s1.toCharArray()) hs1.add(ch);
         for (char ch : s2.toCharArray()) hs2.add(ch);

         ArrayList<Character> al = new ArrayList<>();

         for (char c1 : hs1) {
             if (!hs2.contains(c1)) {
                 al.add(c1);
             }
         }
         for (char c2 : hs2) {
             if (!hs1.contains(c2)) {
                 al.add(c2);
             }
         }

         Collections.sort(al);

         StringBuilder sb = new StringBuilder();
         for (char c : al) {
             sb.append(c);
         }

         return sb.toString();
     }
 }