class Solution {
    public int countCoversions(String s) {
        // code here
        char ch1 = '2';
                char ch2 = '1';
                int count = 0;

                for(int i = 0 ; i < s.length()-1 ; i++){

                    if(s.charAt(i) == ch1 && s.charAt(i+1) == ch2){

                        count++;
                    }
                }
                return count;
    }
}