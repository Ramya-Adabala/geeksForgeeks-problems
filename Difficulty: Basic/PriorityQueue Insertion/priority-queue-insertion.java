class Solution {
    public static PriorityQueue<Integer> insertion(ArrayList<Integer> arr) {
        // code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.size();i++){
            pq.add(arr.get(i));
        }
        return pq;
    }
}