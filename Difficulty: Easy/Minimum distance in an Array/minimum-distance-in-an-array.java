class Solution {
    int minDist(int arr[], int x, int y) {
        // code here
        int ans1=-1,ans2=-1;
        int n=arr.length;
        int minDist=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                ans1=i;
                if(ans2!=-1){
                    minDist=Math.min(minDist,Math.abs(ans1-ans2));
                }
            }
            if(arr[i]==y){
                ans2=i;{
                    if(ans1!=-1){
                         minDist=Math.min(minDist,Math.abs(ans1-ans2));
                    }
                }
            }
        }
        if(ans1==-1|| ans2==-1){
            return -1;
        }
        return minDist;
    }
}