import java.util.*;
public class Vote {
    public static void Vote_Eligible(int age){
        if (age >= 18) {
            System.out.println("Your are Eligible for Voting");
        }
        else{
            System.out.println("Your not Eligible for vote");
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();

        Vote_Eligible(age);
        sc.close();
    }
}
