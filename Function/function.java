import java.util.Scanner;

public class function{

    public static int add(int no1, int no2){
        int sum = no1 + no2;
        return sum;
    }

    public static int multiply(int no1, int no2){
        int product = no1* no2;
        return product;
    }

    public static void Fact(int n)
    {
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("Factorial of Given Number is: "+fact);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("1.Sum of Two Numbers");
        System.out.println("2.Product of Two Numbers");
        System.out.println("3.Factorial of Number");
        System.out.println("4.Exit");

        System.out.println("Enter Your Choice :");
        int choice = sc.nextInt();
       
        switch (choice) {
            case 1:
                System.out.println("Enter Number 1:");
                int no1 = sc.nextInt();

                System.out.println("Enter Number 2:");
                int no2 = sc.nextInt();

                int sum = add(no1, no2);
                System.out.println("Sum of two number is:"+sum);
                break;
            case 2:
                System.out.println("Enter Number 1:");
                int n1 = sc.nextInt();

                System.out.println("Enter Number 2:");
                int n2 = sc.nextInt();
                
                int prod = multiply(n1, n2);
                System.out.println("Product of Two Number is:"+ prod);
                break;

            case 3:
                System.out.println("Enter Number for Factorial:");
                int n = sc.nextInt();
                Fact(n);
                break;

            case 4:
                System.out.println("Thank You.....");
                System.exit(0);
            default:
                System.out.println("Invalid Choice!!!");
                break;
        }
        

        

        

       
        
        sc.close();
    }
}