class Solution {
    public static boolean isPalinArray(int[] arr) {
        // code here.\
        for(int i=0;i<arr.length;i++){
            int y = arr[i];
            int sum = 0;
            
            while(y>0){
                int last_digit = y % 10;
                sum = (sum*10) + last_digit;
                y = y/10;
            }
                if(arr[i]!=sum)
                return false;
        }
        return true;
    }
}