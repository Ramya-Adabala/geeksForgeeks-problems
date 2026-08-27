class Solution {
    public int remAnagram(String s1, String s2) {
        // code here
        char a1[]=s1.toCharArray(); Arrays.sort(a1);
        char a2[]=s2.toCharArray();Arrays.sort(a2);
        int m=s1.length();
        int c=0;
        int n=s2.length();
        int i=0,j=0;
        while(i<m && j<n){
            if(a1[i]==a2[j]){
                i++;j++;
            }
            else if(a1[i]<a2[j]) {
                i++;
                c++;
            }
            else{
                j++;c++;
            }
        }
        c+=(m-i)+(n-j);
        return c;
    }
};