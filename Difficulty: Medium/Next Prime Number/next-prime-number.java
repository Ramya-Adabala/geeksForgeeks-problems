// User function Template for Java
class Solution {
    public static int nextPrime(int n) {
int  num=n+1;
        while(true){
            if(isprime(num)) return num;
            num+=1;
        }}
        public static boolean isprime(int num){
            if(num<2) return false;
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0)
                return false;
            }
        return true;
        }}