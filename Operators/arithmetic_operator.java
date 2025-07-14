import java.util.Scanner;

public class arithmetic_operator {

    //Binary Operator
    public static void plus(int a, int b){
        int sum = a + b;
        System.out.println("Addition is:" +sum);
        return;
    }

    public static void minus(int a, int b){
        int sub = a - b;
        System.out.println("Substraction is:" + sub);
        return;
    }

    public static void multi(int a, int b){
        int mul = a * b;
        System.out.println("Multiplication is:" + mul);
        return;
    }

    public static void divide(int a, int b){
        if (b == 0 ) {
            System.out.println("Can not divide by Zero");
        }
        else{
            int div = a / b;
            System.out.println("Division is:" + div);
        }
        return;
    }

    public static void modulus(int a, int b){
        int mod = a % b;
        System.out.println("Mod is:" + mod);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Exit");

        System.out.println("Enter Which Binary Operation do you want to perform:");
        int choice = sc.nextInt();
        System.out.println("Enter Number 1:");
        int no1 = sc .nextInt();

        System.out.println("Enter Number 2:");
        int no2 = sc .nextInt();

        switch (choice) {
            case 1:
                plus(no1, no2);
                break;
            
            case 2:
                minus(no1, no2);
                break;
        
            case 3:
                multi(no1, no2);
                break;
            
            case 4:
                divide(no1, no2);
                break;

            case 5:
                modulus(no1, no2);
                break;
            
            case 6:
                System.out.println("Program Exited......");
                System.exit(6);
            default:
                System.out.println("Invalid Choice!!!");
                break;
        }
        sc.close();
    }
}
