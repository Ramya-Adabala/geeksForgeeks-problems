// User function Template for Java

class Solution {
    String removeCharacters(String s) {
        // code here
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char m=s.charAt(i);
            if(Character.isDigit(m))
            sb.append(m);
        }
        return sb.toString();
    }
}