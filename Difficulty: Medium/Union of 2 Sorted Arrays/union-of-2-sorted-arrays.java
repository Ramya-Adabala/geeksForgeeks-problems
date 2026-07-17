class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        int i=0,j=0;
        while(i<a.length &&j<b.length){
            if(a[i]==b[j]){
                if(al.isEmpty() || al.get(al.size()-1)!=a[i]){
                al.add(a[i]);}
                
                i++;j++;
            }
            else if(a[i]<b[j]){
                if(al.isEmpty() || al.get(al.size()-1)!=a[i])
                al.add(a[i]);
                i++;
            }
            else{
                if(al.isEmpty() || al.get(al.size()-1)!=b[j])
                al.add(b[j]);
                j++;
              
            }
        }
        while(i<a.length){
            if(al.isEmpty() || al.get(al.size()-1)!=a[i]){
            al.add(a[i]);}
            i++;
        }
        while(j<b.length){
            if(al.isEmpty() || al.get(al.size()-1)!=b[j])
            al.add(b[j]);
            j++;
        }
        return al;
    }
}
