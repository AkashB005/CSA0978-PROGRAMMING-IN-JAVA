import java.util.Arrays;
import java.util.Scanner;
public class NthLargestNumber {
    public static int findNthLargest(int[] arr, int N) {
        Arrays.sort(arr);
        return arr[arr.length - N];
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] list = {14, 67, 48, 23, 5, 62};        
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        int nthLargest = findNthLargest(list, N);
        System.out.println(N + "th Largest number: " + nthLargest);
    }
}