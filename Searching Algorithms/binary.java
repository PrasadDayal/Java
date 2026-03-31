import java.util.Arrays;
import java.util.Scanner;

public class binary {

    public static int binarySearch(int[] arr, int search) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == search) {
                System.out.println("Element found at index: " + mid);
                return mid;
            }
            else if (arr[mid] < search) {
                left = mid + 1;
            } else {
                right = mid - 1;    
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Elements:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); 

        System.out.println("Enter element to Search:");
        int search = sc.nextInt();
        
        int result = binarySearch(arr, search);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
