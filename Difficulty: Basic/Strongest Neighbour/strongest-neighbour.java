class Solution {
    public ArrayList<Integer> maxAdj(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<n-1;i++){
            int max=Math.max(arr[i],arr[i+1]);
            al.add(max);
        }
        return al;
    }
};