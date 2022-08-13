package amazon;

/**
 * Given a string,
 * return the longest palindromic substring within it.
 */
public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        System.out.println(returnLongestPalindrome("emkeka"));

    }

    public static String returnLongestPalindrome(String s){
        if (s.length() == 0)
                return "";
        int startPointer = 0;
        int endPointer = 0;

            for (int i = 0; i < s.length(); i++){
                int len1 = returnPalindromeLength(s, i, i);// for odd length
                int len2 = returnPalindromeLength(s, i, i+1); // for even length
                int len = Math.max(len1, len2);

                if (len > endPointer - startPointer){
                    startPointer = i - (len - 1 ) / 2;
                    endPointer = i + len / 2;
                }
            }
            return  s.substring(startPointer, endPointer + 1);
    }

    private static int returnPalindromeLength(String s, int left, int right) {

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        return right - left - 1;
    }
}
