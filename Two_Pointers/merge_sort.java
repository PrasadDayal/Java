import java.util.Arrays;

public class merge_sort {
    public static int[] mergeSort(int arr1[], int arr2[]){

        int n = arr1.length;
        int m = arr2.length;

        int result[] = new int[n + m];

        int i = 0, j = 0, index = 0;

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                result[index] = arr1[i];
                index++;
                i++;
            }
            else{
                result[index] = arr2[j];
                index++;
                j++;
            }
        }

        while (j < m) {
            result[index] = arr2[j];
            index++;
            j++;
        }

        while (i < n) {
            result[index] = arr1[i];
            index++;
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        int arr1[] = {1,4,6};
        int arr2[] = {8,9,10};

        System.out.println("Input Array 1 is: " + Arrays.toString(arr1));
        System.out.println("Input Array 2 is: " + Arrays.toString(arr2));
        int[] merge = mergeSort(arr1, arr2);
        System.out.print("Sorted  Array is: " + Arrays.toString(merge));
    }
}
