import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side length of the square:");
        double sideLength = scanner.nextDouble();
        double area = sideLength * sideLength;
        System.out.println("The area of the square is: " + area);
        scanner.close(); 
    }
}