import java.util.Scanner;

public class MultipleOf3Or7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first integer:");
        int number = scanner.nextInt();

        if (number > 0) {
            boolean isMultiple = isMultipleOf3Or7(number);
            System.out.println(isMultiple);
        } else {
            System.out.println("Please enter a positive integer.");
        }
    }

    public static boolean isMultipleOf3Or7(int number) {
        return number % 3 == 0 || number % 7 == 0;
    }
}