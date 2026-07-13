class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        
        long sum = 0;
        int n = arr.length;
        int start = 0;
        
        for (int end = 0; end < n; end++) {
            sum += arr[end];
            
            // Shrink window from left if sum exceeds target
            while (sum > target && start <= end) {
                sum -= arr[start];
                start++;
            }
            
            // If current window sum equals target
            if (sum == target) {
                result.add(start + 1);  // 1-based indexing
                result.add(end + 1);    // 1-based indexing
                return result;
            }
        }
        
        result.add(-1);
        return result;
    }
}
