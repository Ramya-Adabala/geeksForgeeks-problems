class Solution {
static int extractMaximum(String S) {
    int num = 0;
    int max = -1;
    boolean foundDigit = false; 
    
    for (int i = 0; i < S.length(); i++) {
        if (Character.isDigit(S.charAt(i))) {
            num = num * 10 + (S.charAt(i) - '0');
            foundDigit = true;
        } else {
            if (foundDigit && num > max) {
                max = num;
            }
            num = 0;
            foundDigit = false;
        }
    }
    
    
    if (foundDigit && num > max) {
        max = num;
    }
    
    return max;
}}

