import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sqr_sorted_array {
    public static int[] squareArray(int[] main){

        int n = main.length;
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        //for positive ad=nd negative numbers
        for(int num : main){
            if (num < 0) {
                neg.add(num);
            }
            else{
                pos.add(num);
            }
        }

        //No Negative Numbers 
        if (neg.size() == 0) {
            for (int i = 0; i < pos.size(); i++) {
                pos.set(i, pos.get(i) * pos.get(i));
            }
            return pos.stream().mapToInt(Integer::intValue). toArray();
        }

        //No Positive Numbers
        if (pos.size() == 0) {
            for (int i = 0; i < neg.size(); i++) {
                neg.set(i, neg.get(i) * neg.get(i));
            }
            return neg.stream().mapToInt(Integer::intValue).toArray();
        }

        //for both +ve and -ve numbers
        int i =0, j = 0, id = 0;
        int n1 = neg.size();
        int n2 = pos.size();
        int[] res = new int[n1 + n2];

        //Sqr the negative numbers and reverse them
        for(i = 0; i < n1; i++){
            neg.set(i, neg.get(i) * neg.get(i));
        }
        Collections.reverse(neg);

        //sqr the positive numbers
        for (i = 0; i < n2; i++) {
            pos.set(i, pos.get(i) * pos.get(i));
        }
        
        while (i < n1 && i < n2) {
            if (neg.get(i) <= pos.get(i)) {
                res[id++] = neg.get(i++);
            } 
            else{
                res[id++] = pos.get(i++);
            }
        }

        while (i < n1) {
            res[id++] = neg.get(i++);
        }

        while (j < n2) {
            res[id++] = pos.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {10, -2, -8, 7, -10};

        int res[] = squareArray(arr);
        

    }
}