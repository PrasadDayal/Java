import java.util.*;

public class Array {
    public static void main(String[] args) {
        // int[] marks = new int[3];
        // marks[0] = 98;
        // marks[1] = 96;
        // marks[2] = 95;
        // System.out.println("Marks are: " + marks[0] +"\n"+ marks[1]+"\n" + marks[2]+"\n");
        // for (int i = 0; i <=2 ; i++) {
        //     System.out.println(marks[i]);
        // }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int size = sc.nextInt();

        int number[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter Array Element:");
            number[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        for (int i = 0; i < number.length ; i++) {
            if (number[i] == x) {
                System.out.println(" X found at Index:" + i);
            }
        }
        sc.close();
    }
}
