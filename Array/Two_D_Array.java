import java.util.Scanner;

public class Two_D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows:");
        int row = sc.nextInt();

        System.out.println("Enter Columns:");
        int cols = sc.nextInt();

        System.out.println("Enter Array Element: ");
        int num[][] = new int [row][cols];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                num[i][j]=sc.nextInt();
            }
        }

        System.out.println("2 Dim Array is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
