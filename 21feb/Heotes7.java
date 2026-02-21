public class Heotes7
{
  /**
    * This method returns the length of the longest substring
    * that does not contain any vowel.
    *
    * @param str The input string
    * @return int The length of the longest non-vowel substring
    */
    public static int longestNonVowelSubstring(String str) {
        int maxLength = 0;  // To store the maximum length found
        int currentLength = 0;  // To track the current non-vowel sequence

        // Convert the input string to lowercase to handle uppercase vowels
        str = str.toLowerCase();

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                // If vowel found, update maxLength and reset current count
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 0;
            } else {
                // If consonant, increase the count
                currentLength++;
            }
        }

        // Final update for the last substring
        maxLength = Math.max(maxLength, currentLength);

        return maxLength;
    }

    public static void main(String[] args) {
        String input = "hellotherebeautifulworld";  // Example input
        int result = longestNonVowelSubstring(input);
        System.out.println("Longest substring without vowels: " + result);
    }
}