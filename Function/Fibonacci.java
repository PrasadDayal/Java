import java.util.*;
public class Fibonacci {
    public static void fibb(int no){
        int n1 = 0;
        int n2 = 1;
        int n3;
        for (int i = 0; i < no; i++) {
            System.out.println(n1 +" ");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = sc.nextInt();

        System.out.println("Fibonacci Series is: " );
        fibb(number);

        sc.close();
    }
}
