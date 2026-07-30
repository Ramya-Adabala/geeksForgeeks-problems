class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        int res=1;
        al.add(1);
        for(int i=1;i<n;i++){
            res=res*(n-i);
            res=res/i;
            al.add(res);
        }
        return al;
    }
}