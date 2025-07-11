public class pattern_1 {
    public static void main(String[] args) {
        //Solid Rectangle Pattern
        // *****
        // *****
        // *****
        // *****
        
        int a = 4;
        int b = 5;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
