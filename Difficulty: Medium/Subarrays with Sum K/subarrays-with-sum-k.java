class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> hm=new HashMap<>();
        int count=0,sum=0; int n=arr.length;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            if(sum==k) count++;
            if(hm.containsKey(sum-k)) 
            count+=hm.get(sum-k);
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return count;
    }
}