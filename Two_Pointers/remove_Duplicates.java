// package Two_Pointers/;

import java.util.Arrays;

public class remove_Duplicates {

    public static int removeDuplicate(int[] arr){

        int n = arr.length;
        int n1 = 0, n2 = 1, unique = 0;

        while (n2 < n) {
            if (arr[n2] == arr[n2 - 1]) {
                n2++;
                continue;
            }

            else{
                n1++;
                arr[n1] = arr[n2];
                unique++;
                n2++;
            }
        }
        return unique + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,5,7,7};

        int result = removeDuplicate(arr);
        System.out.println("Original Array with duplicate elements:");
        System.out.println(Arrays.toString(arr));

        System.out.println("After Removing Duplicate Array Elements: ");
        for(int i = 0; i < result; i++){
            System.out.print(arr[i] + " ");
        }
    }
}