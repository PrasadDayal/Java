public class pattern_6 {
    public static void main(String[] args) {
        //Half Pyramid (Number Pattern)
        //1
        //1 2
        //1 2 3
        //1 2 3 4
        //1 2 3 4 5

        int r = 5;
        for (int i = 1; i <=r ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
