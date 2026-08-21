class Solution {
    public int maxDays(int arr[]) {
        // code here
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}