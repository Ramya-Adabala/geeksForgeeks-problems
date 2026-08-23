class Solution {
    public ArrayList<Integer> sumClosest(int[] arr, int target) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        if(arr.length == 1)
            return res;
        Arrays.sort(arr);
        int left = 0 , right = arr.length - 1;
        int min = Integer.MAX_VALUE, a = 0, b = 0;
        while(left < right){
            int diff = Math.abs(arr[left] + arr[right] - target) ;
            if(diff < min){
                a = arr[left];
                b = arr[right];
                min = diff;
            }
            if(arr[left] + arr[right] > target){
                right--;
            }
            else{
                left++;
            }
        }
        res.add(a);
        res.add(b);
        return res;
    }
}