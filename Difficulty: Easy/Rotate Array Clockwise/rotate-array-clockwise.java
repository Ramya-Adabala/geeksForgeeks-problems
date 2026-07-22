class Solution {
    public void rotateclockwise(int[] arr, int k) {
        // code here
        int n=arr.length;
        k%=n;
        int index=0;
        int res[]=new int[n];
        for(int i=n-k;i<n;i++){
            res[index++]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            res[index++]=arr[i];
        }
        for(int i=0;i<res.length;i++){
            arr[i]=res[i];
        }
    }
}