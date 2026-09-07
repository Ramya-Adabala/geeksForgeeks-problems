class Solution {
    // function to print alternate elements of an array
    public ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<arr.length;i+=2){
            al.add(arr[i]);
        }
        return al;
    }
}