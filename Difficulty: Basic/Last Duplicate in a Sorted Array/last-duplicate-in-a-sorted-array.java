class Solution {
    public int[] dupLastIndex(int[] arr) {
        // Complete the function
        int[] res = new int[2];
                for(int i=arr.length-1;i>0;i--){
                    if(arr[i] == arr[i-1]){
                        res[0] = i;
                        res[1] = arr[i];
                        break;
                    }
                }
                if(res[0]==0 && res[1]==0){
                   res[0] = -1;
                   res[1] = -1;
                }
                return res;
    }
}
