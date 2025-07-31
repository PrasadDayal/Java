import java.util.Arrays;
import java.util.Scanner;


public class reverse_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Array Elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Reverse(arr);
        System.out.println("Reversed Array is: " + Arrays.toString(arr));
    }


    public static void Reverse(int arr[]){
    int start = 0;
    int end = arr.length - 1;

    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        start++;
        end--;
    }
}

}
