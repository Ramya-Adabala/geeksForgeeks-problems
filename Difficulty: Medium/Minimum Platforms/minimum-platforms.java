class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
    int n=arr.length;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int ans=0,res=0;
        int i=0,j=0;
        while(i<n ){
            if(arr[i]<=dep[j]){
                ans++;
                i++;
            }
            else{
                ans--;j++;
            }
            res=Math.max(res,ans);
        }
        return res;
    }
}
