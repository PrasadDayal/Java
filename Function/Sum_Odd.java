import java.util.*;
public class Sum_Odd {

    public static void Odd_Sum(int no1){
        int Sum = 0;
        for (int i = 1; i <= 2 * no1; i += 2) {
            Sum += i; 
            // System.out.println(Sum);
        }
        System.out.println(Sum);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n1 = sc.nextInt();

        System.out.println("Sum of Odd Number is:");
        Odd_Sum(n1);
        sc.close();
    }
}
