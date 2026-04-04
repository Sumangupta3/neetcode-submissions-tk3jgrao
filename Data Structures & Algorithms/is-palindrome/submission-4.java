class Solution {
    public boolean isPalindrome(String str) {
        int i=0,j=str.length()-1;
        String s =  str.toLowerCase();
        while(i<j){
            while(i<s.length() && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(j>=0 && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }

            if(i<s.length() && j>=0 && s.charAt(i) != s.charAt(j) ) return false;
            i++;j--;
        }
        return true;
        
    }
}
