import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        System.out.print("Negative elements of the array: ");

        for (int i = 0; i < size; i++) {
            if (array[i] < 0) {
                System.out.print(array[i] + " ");
                sum += array[i];
            }
        }

        System.out.println("\nSum of negative elements: " + sum);
        scanner.close();
    }
}
