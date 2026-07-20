class Solution {
    void rearrange(ArrayList<Integer> arr) {
        int n = arr.size();
        
        for (int i = 0; i < n; i++) {
            
            if ((i % 2 == 0 && arr.get(i) < 0) || (i % 2 != 0 && arr.get(i) >= 0)) {
                
               
                int j = i + 1;
                while (j < n) {
                    if (i % 2 == 0 && arr.get(j) >= 0) break;
                    if (i % 2 != 0 && arr.get(j) < 0) break;
                    j++;
                }
                
                
                if (j < n) {
                    int temp = arr.get(j);
                    for (int k = j; k > i; k--) {
                        arr.set(k, arr.get(k - 1));
                    }
                    arr.set(i, temp);
                } else {
                   
                    break;
                }
            }
        }
    }
}