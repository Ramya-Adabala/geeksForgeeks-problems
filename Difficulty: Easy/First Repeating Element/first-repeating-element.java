class Solution {
    public int firstRepeated(int[] arr) {
        // code here
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int num:arr){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        for(int i=0;i<arr.length;i++){
            if(hm.get(arr[i])>1){
                return i+1;
            }
        }
        return -1;
    }
}
