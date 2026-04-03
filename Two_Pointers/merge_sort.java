import java.util.Arrays;

public class merge_sort {
    public static int[] mergeSort(int arr1[], int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        
        int res[] = new int[n + m];

        int i = 0, j = 0, index = 0;

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                res[index] = arr1[i];
                index++;
                i++;
            }
            else{
                res[index] = arr2[j];
                index++;
                j++;
            }
        }

        while (j < m ) {
            res[index] = arr2[j];
            index++;
            j++;
        }

        while (i < n) {
            res[index] = arr1[i];
            index++;
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        int arr1[] = {2,40,46};
        int arr2[] = {3, 25, 27};

        int[] merge = mergeSort(arr1, arr2);
        System.out.print("Sorted Array is: " + Arrays.toString(merge));
    }
}