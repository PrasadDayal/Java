import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        System.out.println("Select Which Pattern want to draw : ");
        System.out.println("1. Solid Rectangle");
        System.out.println("2. Hollow Rectangle");
        System.out.println("3. Half Pyramid");
        System.out.println("4. Inverted Half Pyramid");
        System.out.println("5. Inverted Half Pyramid Rotated by 180 degree");
        System.out.println("6. Half Pyramid (Number Pattern)");
        System.out.println("7. Inverted Half Pyramid with Number");
        System.out.println("8. Floyd Triangle");
        System.out.println("9. 0-1 Triangle");
        System.out.println("10. Exit");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Choice:");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                int a = 4;
                int b = 5;
                System.out.println("Solid Rectangle");
                for (int i = 1; i <= a; i++) {
                    for (int j = 1; j <= b; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            
            case 2:
                int p = 4;
                int q = 5;
                System.out.println("Hollow Rectangle");
                for (int i = 1; i <= p; i++) {
                    for (int j = 1; j <= q; j++) {
                        if(i==1 || j==1 || i==p || j==q ){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");                
                        }
                    }
                    System.out.println();
                }
            break;

            case 3:
                System.out.println("Half Pyramid");
                int n = 4;
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            break;
            
            case 4:
                System.out.println("Inverted Half Pyramid");
                int p1 = 4;
                for (int i = p1; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                } 
            break;
            
            case 5:
                System.out.println("Inverted Half Pyramid Rotated by 180 degree");
                int q1 = 4;
                for (int i = 1; i <= q1; i++) {
                    for (int j = 1; j<=q1-i; j++) {
                        System.err.print(" ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.err.print("*");
                    }
                    System.out.println();
                }
            break;

            case 6:
                System.out.println("Half Pyramid (Number Pattern)");
                int r = 5;
                for (int i = 1; i <=r ; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
            break;

            case 7:
                System.out.println("Inverted Half Pyramid with Number");
                int c = 5;
                for (int i = c; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.err.print(j + " ");
                    }
                    System.out.println();
                }
            break;

            case 8:
                System.out.println("Floyd Triangle");
                int n1 = 5;
                int number = 1;
                for (int i = 1; i <= n1; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(number + " ");
                        number++;
                    }
                    System.out.println();
                }
            break;

            case 9:
                System.out.println("0-1 Triangle");
                int p2 = 5;
                for (int i = 1; i <= p2; i++) {
                    for (int j = 1; j <= i; j++) {
                        int sum = i+j;
                        if((sum % 2 == 0)){
                            System.out.print("1 ");
                        }
                        else
                    {
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }
            break;

            case 10 :
                System.out.println("Program Exit Successfully......");
                System.exit(0);
            break;


            default:
                System.out.println("Invalid Choice!!!");
                break;
        }
        sc.close();
    }
}