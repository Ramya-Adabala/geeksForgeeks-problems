class Solution {
    public static boolean areEqual(LinkedList<Integer> ll1, LinkedList<Integer> ll2) {
        // Your code here
        int n1=ll1.size();
        int n2=ll2.size();
        if(n1!=n2) return false;
        for(int i=0;i<n1;i++){
            if(ll1.get(i)!=ll2.get(i)){
                return false;
            }
        }
        return true;
    }
}
