import java.util.Scanner;

public class Relational_operator {

    public static void equal(int a, int b){
        if(a == b){
            System.out.println("Numbers are Equals");
        }
        else{
            System.out.println("Numbers are not Equals");
        }
        return;
    }

    public static void not_equal(int a, int b){
        if(a != b){
            System.out.println("Numbers are not Equals");
        }
        else{
            System.out.println("Numbers are Equals");
        }
        return;
    }

    public static void greater(int a, int b){
        if (a > b) {
            System.out.println(a + " is Greater");
        }
        else{
            System.out.println(b + " is Greater");
        }
        return;
    }

    public static void lesser(int a, int b){
        if (a < b) {
            System.out.println(a + " is Smaller");
        }
        else{
            System.out.println(b + " is Smaller");
        }
        return;
    }

    public static void Greater_equals(int a, int b){
        if (a >= b) {
            System.out.println(a + " is Greater");
        }
        else{
            System.out.println(b + " is Greater");
        }
        return;
    }

    public static void Smaller_equals(int a, int b){
        if (a <= b) {
            System.out.println(a + " is Smaller");
        }
        else{
            System.out.println(b + " is Smaller");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Equals_to Operation");
        System.out.println("2. Not Equals_to Operation");
        System.out.println("3. Greater Than Operation");
        System.out.println("4. Less Than Operation");
        System.out.println("5. Greater Than Equals Operation");
        System.out.println("6. Less Than Equals Operation");
        System.out.println("7. Exit");

        System.out.println("Enter Which Relational Operation do you want to perform:");
        int choice = sc.nextInt();
        System.out.println("Enter Number 1:");
        int no1 = sc .nextInt();

        System.out.println("Enter Number 2:");
        int no2 = sc .nextInt();

        switch (choice) {
            case 1:
                equal(no1, no2);
                break;
        
            case 2:
                not_equal(no1, no2);
                break;
        
            case 3:
                greater(no1, no2);
                break;

            case 4:
                lesser(no1, no2);
                break;

            case 5:
                Greater_equals(no1, no2);
                break;

            case 6:
                Smaller_equals(no1, no2);
                break;

            case 7:
                System.out.println("Program Exited.....");
                System.exit(0);

            default:
                System.out.println("Invalid Choice!!!!");
                break;
        }
        sc.close();
    }
}