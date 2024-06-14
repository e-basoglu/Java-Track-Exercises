package exercise_6_calibrationValues;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class CalibrationValues {

    // Function to extract calibration value from a line
    public static int extractCalibrationValue(String line) {
        Character firstDigit = null;
        Character lastDigit = null;

        // Find the first digit
        for (int i = 0; i < line.length(); i++) {
            if (Character.isDigit(line.charAt(i))) {
                firstDigit = line.charAt(i);
                break;
            }
        }

        // Find the last digit
        for (int i = line.length() - 1; i >= 0; i--) {
            if (Character.isDigit(line.charAt(i))) {
                lastDigit = line.charAt(i);
                break;
            }
        }

        if (firstDigit != null && lastDigit != null) {
            return Integer.parseInt("" + firstDigit + lastDigit);
        } else {
            return 0;
        }
    }

    // Function to sum calibration values from a list of lines
    public static int sumCalibrationValues(List<String> lines) {
        int total = 0;
        for (String line : lines) {
            total += extractCalibrationValue(line);
        }
        return total;
    }

    public static void main(String[] args) {
        // Reading input lines
        Scanner scanner = new Scanner(System.in);
        List<String> inputLines = new ArrayList<>();

        System.out.println("Enter the calibration document lines (end input with an empty line):");
        while (true) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            inputLines.add(line);
        }

        // Calculate the sum of calibration values
        int result = sumCalibrationValues(inputLines);
        System.out.println("The sum of all calibration values is: " + result);

        scanner.close();
    }
}
