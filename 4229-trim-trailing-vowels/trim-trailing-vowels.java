class Solution {
    public String trimTrailingVowels(String s) {
        while (s.length() > 0) {
            char c = s.charAt(s.length() - 1);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                s = s.substring(0, s.length() - 1);
            else
                break;
        }
        return s;
    }
}