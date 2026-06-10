class Solution {
    public int strStr(String haystack, String needle) {

        // Loop through all possible starting positions
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            int j = 0;

            // Compare characters of needle with haystack
            while (j < needle.length() &&
                   haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            // If complete needle matched
            if (j == needle.length()) {
                return i;
            }
        }

        // If needle not found
        return -1;
    }
}
