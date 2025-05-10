package Day03.DailyChallenge;
//Reverse a string and check for palindrome without using library methods
public class ReverseString {
    public static void main(String[] args) {
        String original = "madam";
        char[] chars = original.toCharArray();
        String reversed = "";

        // Manually reverse the string
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i];
        }

        // Check for palindrome
        if (original.equals(reversed)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
