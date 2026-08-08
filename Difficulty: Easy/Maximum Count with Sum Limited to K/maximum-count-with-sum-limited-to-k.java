class Solution {
    static int toyCount(int arr[], int K) {
        // code here
        int N=arr.length;
         Arrays.sort(arr);
        int c=0;
        for(int i=0;i<N;i++){
         
            if(arr[i]<=K) {
                K-=arr[i];
                c++;}
            else break;
        }
return c;
        
    }
}