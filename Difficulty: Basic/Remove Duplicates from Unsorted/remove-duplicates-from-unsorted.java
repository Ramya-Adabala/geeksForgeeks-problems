class Solution {
    static ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        HashSet<Integer> hs=new HashSet<>();
        ArrayList<Integer> al=new ArrayList<>();
        for(int x:arr){
            if(hs.add(x))
            al.add(x);
        }
        return al;
    }
}