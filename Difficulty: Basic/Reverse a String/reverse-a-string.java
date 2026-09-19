// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        Stack<Character> st=new Stack<>();
        
        int i=0;
        while(i<s.length()){
            st.push(s.charAt(i));
            i++;
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();
    }
}