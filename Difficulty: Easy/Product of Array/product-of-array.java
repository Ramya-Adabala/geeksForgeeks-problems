class Solution {
    public long product(long arr[]) {
        // code here
        long mod=1000000007L;
        long prod=1;
        for(int i=0;i<arr.length;i++){
            prod=(prod*(arr[i]%mod))%mod;
        }
        return prod;
    }
}