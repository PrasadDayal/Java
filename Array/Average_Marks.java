import java.util.Scanner;

public class Average_Marks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Total Number of Students:");
        int n = sc.nextInt();

        int [] marks = new int[n]; 
        int sum = 0;

        System.out.println("Enter Marks of Students:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
         
        for (int i : marks) {
            sum = sum + i;
        }
        int avg = sum/marks.length;
        System.out.println("Average Marks is:" + avg);

        sc.close();
    }
}
