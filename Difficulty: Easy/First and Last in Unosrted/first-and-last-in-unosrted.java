class Solution {
    public ArrayList<Integer> findIndex(int[] arr, int key) {
        ArrayList<Integer> al = new ArrayList<>();
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i <= j) {
            if (arr[i] != key) {
                i++;
            }
            if (arr[j] != key) {
                j--;
            }
    
            if (i <= j && arr[i] == key && arr[j] == key) {
                al.add(i);
                al.add(j);
                break;
            }
        }

       
        if (al.isEmpty()) {
            al.add(-1);
            al.add(-1);
        }

        Collections.sort(al);
        return al;
    }
};