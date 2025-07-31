import java.util.Arrays;
import java.util.Scanner;

public class str_sort {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter String:");
        String str = sc.nextLine();

        System.out.println("Original String: " + str);

        //Convert string into character array
        char[] arr = str.toCharArray();

        // Approach 1: Using Arrays.sort() method
        /* 
        char temp; // Temporary variable for swapping

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1 ; j < str.length(); j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }  
        }
        System.out.println("Sorted String: " + new String(arr));
        */

        // Approach 2: Using Arrays.sort() method
        Arrays.sort(arr);
        System.out.println("Sorted String: " + new String(arr));
        
        sc.close();
    }
}
