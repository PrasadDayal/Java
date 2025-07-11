public class pattern_7 {
    public static void main(String[] args) {

        //Inverted Half Pyramid with Number
        // 1 2 3 4 5
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1

        int c = 5;
        for (int i = c; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.err.print(j + " ");
            }
            System.out.println();
        }
    }
}
