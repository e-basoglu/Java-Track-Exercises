package exercise_5_reverseWords;

import java.util.Scanner;

public class ReverseWords {

    public static String reverseWords(String str) {
        // Split the string into words
        String[] words = str.split(" ");

        // Use StringBuilder to construct the reversed string
        StringBuilder reversedString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            // Add a space between words (except after the last word)
            if (i != 0) {
                reversedString.append(" ");
            }
        }

        // Convert StringBuilder to String and return
        return reversedString.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String givenString = scanner.nextLine();

        System.out.println("The given string is: " + givenString);

        String newString = reverseWords(givenString);

        System.out.println("The new string after reversing the words is: " + newString);

        scanner.close();
    }
}
