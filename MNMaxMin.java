import java.util.Arrays;
import java.util.Scanner;

public class MNMaxMin {

    public static int findMthMax(int[] array, int m) {
        Arrays.sort(array);
        return array[array.length - m];
    }

    public static int findNthMin(int[] array, int n) {
        Arrays.sort(array);
        return array[n - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the array elements separated by spaces:");
        String[] input = scanner.nextLine().split(" ");
        int[] array = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }
        System.out.println("Enter the value of M (for Mth maximum):");
        int M = scanner.nextInt();
        System.out.println("Enter the value of N (for Nth minimum):");
        int N = scanner.nextInt();
        int mthMax = findMthMax(array, M);
        int nthMin = findNthMin(array, N);
        System.out.println(M + "th Maximum Number = " + mthMax);
        System.out.println(N + "th Minimum Number = " + nthMin);
        System.out.println("Sum = " + (mthMax + nthMin));
        System.out.println("Difference = " + (mthMax - nthMin));
        scanner.close();
    }
}