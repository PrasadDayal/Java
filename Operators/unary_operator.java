public class unary_operator {
    public static void main(String[] args) {
        
        //Increment
        int a = 10;
        int b = ++a;
        System.out.println("By Pre-Increment:" + b);
        int c = a++;
        System.out.println("By Post-Increment:" + c);

        System.out.println();

        //Decrement
        int p = 10;
        int q = --p;
        System.out.println("By Pre-Decrement:" + q);
        int r = p--;
        System.out.println("By Post-Decrement:" + r);
    }
}