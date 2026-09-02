class Solution {
    public void swapElements(int[] arr) {
        // Code here
       
        for(int i=0;i + 2 < arr.length;i++){
            int temp=arr[i];
            arr[i]=arr[i+2];
            arr[i+2]=temp;
           
        }
        //System.out.println(arr);
        
    }
}