package amazon;

/**
 * Given a string,
 * find the total number of palindromic substrings in it.
 * Please note we need to find the total number of substrings and not subsequences.
 */
public class CountPalindromicSubstrings {
    public static void main(String[] args) {
        System.out.println(countPalindromes("ababa"));
        System.out.println(countPalindromes2("ababa"));
    }

    public static int countPalindromes(String s){
        if(s.isEmpty())
            return 0;
        int length = s.length(), count = 0;
        boolean [][] DPTable = new boolean[length][length];
        for(int j = 0; j  < length; j++){
            DPTable[j][j] = true;
            for (int i = 0; i < j; i++){
                if(s.charAt(i) == s.charAt(j) && (j - i <= 2 || DPTable[i+1][j - 1])){
                    DPTable[i][j] = true;
                    count++;
                }
            }
        }
        return count + length;
    }

    public static int countPalindromes2(String st){
        // dp[i][j] will be 'true' if the string from index 'i' to index 'j' is a
        // palindrome
        boolean[][] dp = new boolean[st.length()][st.length()];
        int count = 0;

//         every string with one character is a palindrome
        for (int i = 0; i < st.length(); i++) {
            dp[i][i] = true;
            count++;
        }
        for (int startIndex = st.length() - 1; startIndex >= 0; startIndex--) {
            for (int endIndex = startIndex + 1; endIndex < st.length(); endIndex++) {
                if (st.charAt(startIndex) == st.charAt(endIndex)) {
                    // if it's a two character string or if the remaining string is a palindrome too
                    if (endIndex - startIndex == 1 || dp[startIndex + 1][endIndex - 1]) {
                        dp[startIndex][endIndex] = true;
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
