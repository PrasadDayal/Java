import java.util.Scanner;

public class Reverse_Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Array Elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Original Array is: ");
        for (int element : arr) {
            System.out.print(element +" ");
        }
        System.out.println();
        
        int temp;
        int len = arr.length;
        int a = Math.floorDiv(len, 2);

        for (int i = 0; i < a; i++) {
            temp = arr[i];
            arr[i] = arr[len - i - 1];
            arr[len - i - 1] = temp;
        }

        System.out.println("Reverse Array is: ");
        for (int element : arr) {
            System.out.print(element +" ");
        }
        sc.close();
    }
}
