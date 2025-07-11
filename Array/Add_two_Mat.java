import java.util.Scanner;

public class Add_two_Mat {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int result[][] = {{0,0,0},
                          {0,0,0}};

        int row1 = 2;
        int col1 = 3;
        int mat1[][] = new int[row1][col1];
        System.out.println("Matrix 1:");
        System.out.println("Enter Matrix Element:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        int row2 = 2;
        int col2 = 3;
        int mat2[][] = new int[row2][col2];
        System.out.println("Matrix 2:");
        System.out.println("Enter Matrix Element:");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Addition of Two Matrices are: ");
         for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
