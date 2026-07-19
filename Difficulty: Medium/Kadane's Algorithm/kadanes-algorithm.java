class Solution {
    int maxSubarraySum(int[] a) {
        // Code here
        int n=a.length;
        int dp[]=new int[n];
        dp[0]=a[0];
        for(int i=1;i<n;i++){
            dp[i]=Math.max(dp[i-1]+a[i],a[i]);
        }
        Arrays.sort(dp);
        return dp[n-1];
    }
}
