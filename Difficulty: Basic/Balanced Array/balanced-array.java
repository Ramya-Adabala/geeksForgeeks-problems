class Solution {
    public int minValueToBalance(List<Integer> arr) {
        // code here
        int n=arr.size();
        int sum1=0,sum2=0;
        for(int i=0;i<n/2;i++){
            sum1+=arr.get(i);
        }
        for(int i=n/2;i<n;i++){
            sum2+=arr.get(i);
        }
        return Math.abs(sum1-sum2);
    }
};