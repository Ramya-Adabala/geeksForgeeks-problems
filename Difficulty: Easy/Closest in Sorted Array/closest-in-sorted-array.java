class Solution {
    public static int findClosest(int[] arr, int k) {
        int low = 0, high = arr.length - 1;

        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

      
        if (low >= arr.length) return arr[arr.length - 1];
        if (low == 0) return arr[0];

 
        int diff1 = Math.abs(k - arr[low - 1]);
        int diff2 = Math.abs(k - arr[low]);

        
        return (diff2 <= diff1) ? arr[low] : arr[low - 1];
    }
}