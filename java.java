import java.util.Scanner;
public class PrimeCompositeCounter {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers separated by spaces:");
        String[] input = scanner.nextLine().split(" ");
        int primeCount = 0;
        int compositeCount = 0;
        for (String s : input) {
            int number = Integer.parseInt(s);
            if (number > 1 && isPrime(number)) {
                primeCount++;
            } else if (number > 1) {
                compositeCount++;
            }
        }
        System.out.println("Composite number: " + compositeCount);
        System.out.println("Prime number: " + primeCount);
        scanner.close();
    }
}