class Solution {
    char firstRep(String S) {
        // your code here
        int n=S.length();
        int freq[]=new int[26];
        for(int i=0;i<n;i++){
            freq[S.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++){
           if(freq[S.charAt(i)-'a']>1)
           return S.charAt(i);
        }
        return '#';
    }
}