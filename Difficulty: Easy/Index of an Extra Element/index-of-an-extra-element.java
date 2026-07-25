/*Complete the function below*/
class Solution {
    public int findExtra(int a[], int b[]) {
        // add code here.
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i]==b[j])
            i++;j++;
            
        }
        return i;
    }
}