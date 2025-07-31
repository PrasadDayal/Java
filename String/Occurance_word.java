import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Occurance_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");
        String str = sc.nextLine();
        
        Map<Character, Integer> map = new HashMap();
        char ch[] = str.toCharArray();

        for (char c : ch) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }

        System.out.println("Character Occurrences:");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
