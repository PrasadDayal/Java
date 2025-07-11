import java.util.Scanner;

public class str_rev {

    public static void Reverse_Str1(String str){
        char[] ch_Arr = str.toCharArray();
        for (int i = ch_Arr.length-1; i >= 0; i--) {
            System.out.print(ch_Arr[i]);
        }
    }

    public static void Reverse_Str2(String str){
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
    
    public static void Reverse_Str3(String str){
        StringBuffer sb = new StringBuffer(str);
        System.out.print(sb.reverse());
    }

    public static void Reverse_Str4(String str){
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length()/2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;

            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println(sb);
    }

    public static void Reverse_Str5(String str){
        StringBuilder sb = new StringBuilder(str);
        System.out.print(sb.reverse());
    }  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.println("1. By Using toCharArray() Method");
        System.out.println("2. By Using charAt() Method");
        System.out.println("3. By Using String Buffer Class using reverse() method");
        System.out.println("4. By Using String Builder Class");
        System.out.println("5. By Using String Builder Class using reverse() method");
        System.out.println("6. Exit");

        System.out.println("Enter which Method is use for Reverse the String:");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Reverse String using toCharArray() Method: ");
                Reverse_Str1(str);
                break;
            
            case 2:
                System.out.println("Reverse String using charAt() Method:");
                Reverse_Str2(str);
                break;
            
            case 3:
                System.out.println("Reverse String using String Buffer Class:");
                Reverse_Str3(str);
                break;

            case 4:
                System.out.println("Reverse String using String Builder Class:");
                Reverse_Str4(str);
                break;

            case 5:
                System.out.println("Reverse String using String Builder Class using everse() method:");
                Reverse_Str5(str);
                break;
        
            case 6:
                System.out.println("Program Exited......");
                System.exit(5);
                break;
            default:
                System.out.println("Invalid Choice!!!!");
                break;
        }
        sc.close();  
    }
}