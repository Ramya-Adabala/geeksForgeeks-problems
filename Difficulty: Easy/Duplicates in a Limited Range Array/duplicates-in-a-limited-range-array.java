class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> obj=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int x:arr){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            if(e.getValue().equals(2))
            obj.add(e.getKey());
        }
        return obj;
    }
}