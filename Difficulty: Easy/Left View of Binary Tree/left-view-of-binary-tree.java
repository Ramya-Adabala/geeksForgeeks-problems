class Solution {
    public ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        
        if (root == null) return result;
        
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            
            for (int i = 0; i < size; i++) {
                Node curr = queue.poll();
                
               
                if (i == 0) {
                    result.add(curr.data);
                }
                
                if (curr.left != null)
                    queue.offer(curr.left);
                
                if (curr.right != null)
                    queue.offer(curr.right);
            }
        }
        
        return result;
    }
}