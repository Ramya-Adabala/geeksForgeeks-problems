class Solution {
    public char getMaxOccuringChar(String s) {
        // code here
        int[] maxCount = new int[26];

        for(int i=0; i<s.length(); i++){
            maxCount[s.charAt(i)-'a']++;
        }

        int max = Integer.MIN_VALUE;
        char c = '#';
        for(int i=0; i<26; i++){

            if(maxCount[i]>max){
                max =  maxCount[i];
                c = (char) ('a' + i);
            }
        }

        return c;
    }
}