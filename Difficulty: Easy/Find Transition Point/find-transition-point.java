class Solution {
    int transitionPoint(int arr[]) {
        // code here
        int n=arr.length;
       int l=0,h=n-1;
       int ans=-1;
       while(l<=h){
           int m=l+(h-l)/2;
           if(arr[m]==1){
               ans=m;
               h=m-1;
           }
           else
           l=m+1;
       }
       return ans;
    }
}