class Solution {
    public int countIncreasing(int[] arr) {
        // code here
        int l=0,count=0,prev=arr[0];
        for(int i=1;i<arr.length;i++){
            l=i;
            while(l<arr.length&& prev<arr[l]){
                count++;
                prev=arr[l];
                l++;
            }
            prev=arr[i];
        }
        return count;
    }
}
