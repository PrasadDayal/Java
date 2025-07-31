import java.util.Scanner;

public class remove_whitespace {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        System.out.println("Original String: " + str);

        String W_str = str.replaceAll("\\s", "");
        System.out.println("String after removing whitespace: " + W_str);

        sc.close();
    }
}
