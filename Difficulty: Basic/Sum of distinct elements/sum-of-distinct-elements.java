// User function Template for Java

class Solution {
    int findSum(int arr[]) {
        // code here
        HashSet<Integer> hs=new HashSet<>();
        int sum=0;
        for(int x:arr){
            if(hs.add(x))
            sum=sum+x;
        }
        return sum;
    }
}