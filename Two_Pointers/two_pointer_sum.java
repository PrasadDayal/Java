// package Two_Pointers;
import java.util.Arrays;

public class two_pointer_sum {

    public static int[] two_sum(int[] arr, int target){
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length-1;
        int sum;
        while (i < j) {
            sum = arr[i] + arr[j];

            if (sum == target) {
                return new int[]{arr[i], arr[j]};
            }
            else if (sum < target) {
                i++;
            }
            else{
                j--;
            }
        }

        return new int[]{};
    }
    public static void main(String[] args) {
        
        int n[] = {7, 2, 1, 5, 9};
        int target = 14;

        int[] result = two_sum(n, target);
        if (result.length > 0) {
            System.out.println("Pair of Numbers is : " + result[0] + " and " + result[1]);
        }
        else{
            System.out.println("Pair not Found");
        }
    }
}