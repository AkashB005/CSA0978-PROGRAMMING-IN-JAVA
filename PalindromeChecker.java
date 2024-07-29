import java.util.Scanner;
public class PalindromeChecker {
    public static boolean isPalindromeString(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static boolean isPalindromeNumber(int num) {
        int original = num;
        int reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 to check if a string is a palindrome.");
        System.out.println("Enter 2 to check if a number is a palindrome.");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        switch (choice) {
            case 1:
                System.out.println("Enter the string:");
                String inputString = scanner.nextLine();
                if (isPalindromeString(inputString)) {
                    System.out.println("Palindrome");
                } else {
                    System.out.println("Not a palindrome");
                }
                break;
            case 2:
                System.out.println("Enter the number:");
                int inputNumber = scanner.nextInt();
                if (isPalindromeNumber(inputNumber)) {
                    System.out.println("Palindrome");
                } else {
                    System.out.println("Not a palindrome");
                }
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        scanner.close();
    }
}
