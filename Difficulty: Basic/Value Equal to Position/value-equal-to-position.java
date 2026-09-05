// User function Template for Java

class Solution {
    public ArrayList<Integer> valEqualToPos(int[] nums) {
        // code here
        ArrayList<Integer> obj=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==i+1)
            obj.add(nums[i]);
        }
        return obj;
    }
}