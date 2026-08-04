class Solution {
    public boolean checkElements(int start, int end, int[] arr) {
        // code here
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=start && arr[i]<=end){
                c++;
            }
        }
        if(end-start+1==c) return true;
        else return false;
    }
}