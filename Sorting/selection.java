public class selection {

    public static void printArr(int arr[]){
        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr1[] = {10, 2, 25, 30, 4};
        
        //Selection Sort
        for (int i = 0; i < arr1.length - 1; i++) {
            int small = i;
            for (int j = i+1; j < arr1.length; j++) {
                if (arr1[small] > arr1[j]) {
                    small = j;
                }
            }
            int temp = arr1[small];
            arr1[small] = arr1[i];
            arr1[i] = temp;
        }
        printArr(arr1);
    }
}
