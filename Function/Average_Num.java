import java.util.*;

public class Average_Num {

    public static int avg_1(int n1, int n2, int n3){
        int sum = n1 + n2 + n3;
        int average = sum / 3;
        System.out.println("Average of 3 Number is:"+ average);
        return average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1: ");
        int no1 = sc.nextInt();

        System.out.println("Enter Number 2: ");
        int no2 = sc.nextInt();

        System.out.println("Enter Number 3: ");
        int no3 = sc.nextInt();

        avg_1(no1, no2, no3);
        sc.close();
    }
}
