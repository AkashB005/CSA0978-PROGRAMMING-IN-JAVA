import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        Set<Integer> uniqueItems = removeDuplicates(array);
        System.out.println("Non-duplicate items:");
        System.out.println(uniqueItems);
        scanner.close();
    }
    public static Set<Integer> removeDuplicates(int[] array) {
        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : array) {
            uniqueSet.add(num);
        }
        return uniqueSet;
    }
}
