// User function Template for Java

class Solution {

    public static int visibleBuildings(int a[]) {
        // write code here
     
       
        int c=0;
        int s=0;
        for(int x:a){
           if(x>=s){
               c++;
               s=x;
           } 
        }
            
        
        return c;
    }
}
