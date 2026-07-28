class Solution {
    static int evenlyDivides(int n) {
        // code here
        int temp=n;int count=0;
        while(temp>0){
            int rem=temp%10;
            if(rem>0 && n%rem==0){
            count++;
        }
        temp=temp/10;
        }
        return count;
    }
}