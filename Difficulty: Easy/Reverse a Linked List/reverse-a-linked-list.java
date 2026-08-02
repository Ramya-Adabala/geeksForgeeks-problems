/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
        Stack<Node> st=new Stack<>();
        Node p=head;
        while(p!=null){
            st.push(p);
            p=p.next;
        }
        head=null;Node p1=null;
        while(!st.isEmpty()){
            p=st.pop();
            if(head==null){
                head=p;p1=p;
            }
            else{
                p1.next=p;
                p1=p;}
        }
        p1.next=null;
        return head;
    }
}