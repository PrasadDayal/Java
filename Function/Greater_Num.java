import java.util.*;
public class Greater_Num {

    public static void greater_num(int num1, int num2){
        if (num1 > num2 ) {
            System.out.println(num1 + " Number is Greater");
        }
        else if (num2 > num1){
            System.out.println(num2 + " Number is Greater");
        }
        else{
            System.out.println("Both are same");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1:");
        int no1 = sc.nextInt();

        System.out.println("Enter Number 2:");
        int no2 = sc.nextInt();

        greater_num(no1, no2);
        sc.close();
    }
}
