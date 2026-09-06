class Solution {
    public static void sortByComparator(String[] arr) {
        // code here
        Arrays.sort(arr,(a,b)->a.compareToIgnoreCase(b));
        
    }
}