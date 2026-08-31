// User function Template for Java

class Solution {
    static int remainderWith7(String N) {
        // code here
    int rem=0;
    for(int i=0;i<N.length();i++){
        int d=N.charAt(i)-'0';
        rem=(rem*10+d)%7;
    }
    return rem;
        
        
    }
};