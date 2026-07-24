class Solution {
    int missingNum(int arr[]) {
    // Arrays.sort(arr);
     int n=arr.length+1;
     //if(arr[0]!=1)
    // return 1;
    // if(arr[0]==1 &&n==1)
     //return 2;
     //for(int i=0;i<n;i++){
      //   if(arr[i]-arr[i-1]==1)
      //   return arr[i]-1;
    // }
        //return 0;
        int ans=0;
        
    for(int i=0;i<arr.length;i++){
        ans=ans^arr[i];
    }
    for(int i=1;i<=n;i++){
        ans=ans^i;
    }
    return ans;
    }
}