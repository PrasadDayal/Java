public class pattern_2 {
    public static void main(String[] args) {
        // Hollow Rectangle
        // *****
        // *   *
        // *   *
        // *****
        
        int a = 4;
        int b = 5;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if (i == 1 || j == 1 || i == a || j == b) {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
