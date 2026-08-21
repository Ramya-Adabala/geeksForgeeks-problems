class Solution {
    void segregateEvenOdd(int arr[]) {
        // code here
        Arrays.sort(arr);
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }
        }
        for(int i=0;i<odd.size();i++){
            even.add(odd.get(i));
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=even.get(i);
        }
    }
}