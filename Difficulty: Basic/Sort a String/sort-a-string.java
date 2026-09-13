// User function Template for Java
class Solution {
    String sortString(String s) {
        // code here
       
       char ch[] = s.toCharArray();
       Arrays.sort(ch);
       return new String(ch);
    }
}