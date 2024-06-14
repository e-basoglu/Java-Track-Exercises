package exercise_4_removeAdjacentDuplicates;

public class RemoveAdjacentDuplicates {

    public static String removeAdjacentDuplicates(String str) {
        if (str.length() <= 1) {
            return str;
        }

        StringBuilder result = new StringBuilder();
        boolean hasAdjacentDuplicates = false;

        int i = 0;
        while (i < str.length()) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                    i++;
                }
                hasAdjacentDuplicates = true;
            } else {
                result.append(str.charAt(i));
            }
            i++;
        }

        if (!hasAdjacentDuplicates) {
            return result.toString();
        }

        return removeAdjacentDuplicates(result.toString());
    }

    public static void main(String[] args) {
        String givenString = "aabaarbarccrabmq";
        System.out.println("The given string is: " + givenString);
        String newString = removeAdjacentDuplicates(givenString);
        System.out.println("The new string after removing all adjacent duplicates is: " + newString);
    }
}
