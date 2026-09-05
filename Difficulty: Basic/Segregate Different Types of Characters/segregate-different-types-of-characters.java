class Solution {
    public String[] splitString(String s) {
        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder specialChars = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                letters.append(ch);
            } else if (Character.isDigit(ch)) {
                digits.append(ch);
            } else {
                specialChars.append(ch);
            }
        }

        return new String[] {
            letters.toString(), 
            digits.toString(), 
            specialChars.toString()
        };
    }
}