class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(int i=0;i <s.length(); i++){
            char ch=Character.toLowerCase(s.charAt(i));
            if(Character.isLetterOrDigit(ch)){
                str=str+ch;
            }
        }
        int n=str.length();
         for (int i = 0; i < n / 2; i++) {
        if(str.charAt(i)!=str.charAt(n-1-i)){
            return false;
        }

        
    }
    return true;
}
}