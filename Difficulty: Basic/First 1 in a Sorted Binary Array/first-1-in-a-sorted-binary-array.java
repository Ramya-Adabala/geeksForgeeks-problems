class Solution {
    public int firstIndex(int arr[]) {
        // code here
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==1) return i;
        }
        return -1;
    }
}