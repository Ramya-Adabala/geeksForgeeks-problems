import java.util.*;
class Solution {
    public Deque<Integer> dqInsertion(List<Integer> arr) {
        // code here
        ArrayDeque<Integer> dq=new ArrayDeque<Integer>();
        for(int i=0;i<arr.size();i++){
            dq.offerLast(arr.get(i));
        }
        return dq;
    }
}