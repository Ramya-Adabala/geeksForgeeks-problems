class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        // code here
        
     HashMap<Integer,Integer> hm = new HashMap<>();
       ArrayList<Integer> al = new ArrayList<>();
       int n = arr.length;
       for(int i=1;i<=n;i++){
           hm.put(i,0);
       }
       for(int i=0;i<n;i++){
           if(hm.containsKey(arr[i])){
               int f = hm.get(arr[i]);
               hm.put(arr[i],f+1);
           }
       }
       for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
           al.add(entry.getValue());
       }
       return al;
    }}
