class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder newstr = new StringBuilder();

        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);

            if(Character.isLetterOrDigit(c)){
                newstr.append(Character.toLowerCase(c));
            }
        }
        return newstr.toString().equals(newstr.reverse().toString());
    }
}
