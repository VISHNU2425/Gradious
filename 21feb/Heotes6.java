public class Heotes6{
  public static void main(String[] args) {
        String s = "abcabcbb";
        int length = lengthOfLongestSubstring(s);
        System.out.println("Length of the longest substring without repeating characters: " + length);
    }

    public static int lengthOfLongestSubstring(String s) {
        int[] index = new int[256]; // Array to store the last index of each character
        for (int i = 0; i < 256; i++) {
            index[i] = -1; // Initialize all entries as -1 (not seen yet)
        }

        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If the character was seen before, move the left pointer
            if (index[currentChar] != -1) {
                left = Math.max(index[currentChar] + 1, left);
            }

            // Update the last seen index of the current character
            index[currentChar] = right;

            // Calculate the maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}