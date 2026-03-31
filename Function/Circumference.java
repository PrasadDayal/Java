import java.util.*;
public class Circumference {

    public static void Cirum_ference(int r){
        System.out.println(2 *3.14 *r);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius:");
        int rad = sc.nextInt();
        System.out.println("Circumference is: ");
        Cirum_ference(rad);
        sc.close();
    }
}
