public class Main {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        // Reverse the original string
        String reversed = reverseString(s);
        // Remove vowels from the reversed string
        String withoutVowels = removeVowels(s, reversed);
        // Print the resulting string without vowels
        System.out.println(withoutVowels);
    }
 
    // Function to reverse a string
    public static String reverseString(String s) {
        String reversed = "";
        // Iterate over the original string in reverse order
        for (int i = s.length() - 1; i >= 0; i--) {
            // Append each character to a new string
            reversed += s.charAt(i);
        }
        // Return the reversed string
        return reversed;
    }
 
    // Function to remove vowels from a string
    public static String removeVowels(String s, String reversed) {
        String withoutVowels = "";
        // Iterate over the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // Check if the character is a vowel in original string
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                // If not, append the reversed string character to a new string
                withoutVowels += reversed.charAt(i);
            }
        }
        // Return the string without vowels
        return withoutVowels;
    }
}
