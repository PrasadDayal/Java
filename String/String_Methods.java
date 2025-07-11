import java.util.Scanner;

public class String_Methods {

    public static void concat_str(String str1, String str2){
        System.out.println(str1 + " " + str2);
    }

    public static void Len(String str){
        System.out.println("Length of String is:" +str.length());
    }

    public static void charAT(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    public static void Compare(String str1, String str2){
        if (str1.compareTo(str2) == 0) {
            System.out.println("Strings are Equals");
        }
        else{
            System.out.println("Strings are not Equals");
        }
    }

    public static void Sub_String(String str, int start, int last){
        System.out.println(str.substring(start, last));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1: ");
        String str1 = sc.nextLine();
        System.out.println("Enter String 2: ");
        String str2 = sc.nextLine();

        System.out.println("Select which operation perform on String:");
        System.out.println("1. String Concatenation");
        System.out.println("2. Length of String");
        System.out.println("3. CharAt Method");
        System.out.println("4. Comparision of String");
        System.out.println("5. Sub_String Method");
        System.out.println("6. Exit");

        System.out.println("Enter Option:");
        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                System.out.println("String Concatenation:");
                concat_str(str1, str2);
                break;

            case 2:
                System.out.println("String 1 Length:");
                Len(str1);
                System.out.println("String 2 Length:");
                Len(str2);
                break;

            case 3:
                System.out.println("Character At :");
                charAT(str1);
                break;

            case 4:
                System.out.println("Comparing Two String :");
                concat_str(str1, str2);
                break;
            
            case 5:
                System.out.println("Sub String: ");
                System.out.println("Enter Starting index:");
                int start = sc.nextInt();

                System.out.println("Enter Ending index:");
                int end = sc.nextInt();

                Sub_String(str1, start, end);
                break;

            case 6:
                System.exit(6);
            default:
                System.out.println("Invalid choice!!!!");
                break;
        }
        sc.close();
    }
}
