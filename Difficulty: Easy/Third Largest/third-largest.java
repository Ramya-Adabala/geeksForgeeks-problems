class Solution {
    int thirdLargest(List<Integer> arr) {
        // Your code here
        Collections.sort(arr);
        if(arr.size()<3) return -1;
        return arr.get(arr.size()-3);
    }
}