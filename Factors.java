import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the given number: ");
        int givenNumber = scanner.nextInt();
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        printFactorsAndNthFactor(givenNumber, n);
    }
    public static void printFactorsAndNthFactor(int number, int n) {
        if (number == 0) {
            System.out.println("Given number is 0. It has no factors.");
            return;
        } else if (number < 0) {
            number = Math.abs(number);
            System.out.println("Given number is negative. Considering its absolute value: " + number);
        }
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }
        System.out.println("Number of factors = " + factors.size());

        if (n == 0) {
            System.out.println("N is 0, no nth factor exists.");
        } else if (n <= factors.size()) {
            System.out.println(n + "th factor of " + number + " = " + factors.get(n - 1));
        } else {
            System.out.println(number + " has only " + factors.size() + " factors, so it doesn't have a " + n + "th factor.");
        }
    }
}
