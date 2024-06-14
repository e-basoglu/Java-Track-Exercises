package exercise_2_sumOfFirst100Primes;

public class SumOfFirst100Primes {

    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        long sum = 0;

        while (count < 100) {
            if (isPrime(num)) {
                sum += num;
                count++;
            }
            num++;
        }

        System.out.println("The sum of the first 100 prime numbers is: " + sum);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
