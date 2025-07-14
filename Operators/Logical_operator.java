import java.util.Scanner;

public class Logical_operator {

    public static void Logical_AND(int a, int b, int c){
        if (a == b && b == c) {
            System.out.println("Condition is True");
        }
        else{
            System.out.println("Condition is not True");
        }
        return;
    }

    public static void Logical_OR(int a, int b, int c){
        if (a < b || b < c) {
            System.out.println("Condition is True");
        }
        else{
            System.out.println("Condition is not True");
        }
        return;
    }

    public static void Logical_NOT(int a, int b){
        if (!(a < b)) {
            System.out.println("Condition is True");
        }
        else{
            System.out.println("Condition is not True");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Logical AND");
        System.out.println("2. Logical OR");
        System.out.println("3. Logical NOT");
        System.out.println("4. Exit");

        System.out.println("Enter Which Logical Operation do you want to perform:");
        int choice = sc.nextInt();

        System.out.println("Enter Number 1:");
        int no1 = sc .nextInt();

        System.out.println("Enter Number 2:");
        int no2 = sc .nextInt();

        System.out.println("Enter Number 2:");
        int no3 = sc .nextInt();

        switch (choice) {
            case 1:
                System.out.println("You Choose Logical AND Operation");
                Logical_AND(no1, no2, no3);
                break;

            case 2:
                System.out.println("You Choose Logical OR Operation");
                Logical_OR(no1, no2, no3);
                break;

            case 3:
            System.out.println("You Choose Logical NOT Operation");
                Logical_AND(no1, no2, no3);
                break;

            case 4:
                System.out.println("Program Exiting.....");
                System.exit(3);
                break;

            default:
                System.out.println("Invalid Choice!!!!");
                break;
        }
        sc.close();
    }
}
