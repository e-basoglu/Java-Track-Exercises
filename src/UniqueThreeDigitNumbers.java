public class UniqueThreeDigitNumbers {
    public static void main(String[] args) {
        int count = 0;

        // Loop through each possible value for the hundreds place
        for (int i = 1; i <= 4; i++) {
            // Loop through each possible value for the tens place
            for (int j = 1; j <= 4; j++) {
                // Ensure the tens place is different from the hundreds place
                if (j == i) continue;

                // Loop through each possible value for the ones place
                for (int k = 1; k <= 4; k++) {
                    // Ensure the ones place is different from both the hundreds and tens place
                    if (k == i || k == j) continue;

                    System.out.println("" + i + j + k);
                    count++;
                }
            }
        }

        System.out.println("Total unique three-digit numbers: " + count);
    }
}
