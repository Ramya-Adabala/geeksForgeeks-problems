class Solution {
    public static void fillLinkedList(LinkedList<Integer> ll, int k) {
        // Your code here
        int n=ll.size();
        ll.clear();
        for(int i=0;i<n;i++){
            ll.add(k);
            System.out.print(ll.poll()+" ");
        }
    }
}
