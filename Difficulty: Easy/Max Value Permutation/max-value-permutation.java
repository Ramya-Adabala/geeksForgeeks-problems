// User function Template for Java

class Solution {

    int maxValue(int arr[]) {
        // Complete the function
        int n=arr.length;
        long mod=1000000007;
        Arrays.sort(arr); long sum=0;
        for(int i=0;i<n;i++){
            sum=(sum+ (long) arr[i]*i)%mod;}
            return (int) sum;
    }
}
