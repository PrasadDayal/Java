public class bubble {

    public static void printArr(int arr[]){
        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {10, 2, 1, 4, 5};

        //Bubble Sort
        for (int i = 0; i < arr.length-1; i++) {
           for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
           } 
        }
printArr(arr);
    }
}
