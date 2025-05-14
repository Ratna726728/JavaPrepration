package Day04.DailyChallenge;
//Write a function to count vowels in a string

// A,E,I,O,U are the vowels
public class CountVowels {

    public static int countVowels(String input) {
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < input.length(); i++) {
            if (vowels.indexOf(input.charAt(i)) != -1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String text = "Hello, World!";
        System.out.println("Number of vowels: " + countVowels(text));
    }
}
