class Solution {
    public void segregateElements(int[] nums) {
        // code here
       int n=nums.length;
       int res1[]=new int[n];
       
       int index=0;
       for(int i=0;i<n;i++){
           if(nums[i]>=0){
               res1[index++]=nums[i];
           }
          
       }
       for(int i=0;i<n;i++){
           if(nums[i]<0){
               res1[index++]=nums[i];
           }
       }
       for(int i=0;i<n;i++){
           nums[i]=res1[i];
       }
       
      
    }
}