import java.util.Scanner;

public class Num_prsent {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of an Array:");
        int n = sc.nextInt();

        int [] marks = new int[n];

        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.println("Enter Number You Want to Search: ");
        int num = sc.nextInt();
        boolean isInArray = false;

        for (int i : marks) {
            if (num == i) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("Value is in an Array");
        }
        else{
            System.out.println("Value is not in an Array");
        }
        sc.close();
    }
}
