import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Remove_duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        System.out.println("Original String: " + str);

        /*//Approach 1

        str.chars().distinct().forEach(c -> sb.append((char)c));
        System.out.println("String after removing Duplicates: " + sb);
        */

        /* 
        //Approach 2

        System.out.println("Removing Duplicates By charAt() Method:");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int idx = str.indexOf(ch, i+1);
            if (idx == -1) {
                sb.append(ch);
            }
        }
        System.out.println("String after removing Duplicates: " + sb);

        */

        /*
        // Approach 3
        System.out.println("Removing Duplicates By character Array:");
        char arr[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            boolean repeat = false;
            for (int j = i+1; j < str.length(); j++) {
                if (arr[i] == arr[j]) {
                    repeat = true;
                    break;    
                }
            }
            if (!repeat) {
                sb.append(arr[i]);
            }
        }
        System.out.println("String after removing Duplicates: " + sb);
        */

        // Approach 4
        System.out.println("Removing Duplicates By using Set Interface:");
        Set<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i)); 
        }

        for(Character c : set){
            sb.append(c);
        }
        System.out.println("String after removing Duplicates: " + sb);
        sc.close();
    }
}
