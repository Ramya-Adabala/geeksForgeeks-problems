class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        Arrays.sort(arr);
        ArrayList<Integer> obj=new ArrayList<>();
        int x=arr[0];
        int y=arr[arr.length-1];
        obj.add(x);obj.add(y);
        return obj;
    }
}
