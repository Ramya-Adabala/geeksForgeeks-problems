// User function Template for Java

class Solution {
    public String remConsonants(String s) {
        // code here.
        char c;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
          c=s.charAt(i);
if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        {  
        sb.append(c);
    }}
  
    return sb.toString();
    
}}
