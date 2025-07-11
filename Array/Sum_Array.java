import java.util.Scanner;

public class Sum_Array {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:");
        int n = sc.nextInt();

        float [] num = new float[n];
        float sum = 0;

        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextFloat();
        }

        for (float f : num) {
            sum = sum + f;
        }
        System.out.println("The value of sum is:" + sum);
        sc.close();
    }
}
