
import java.util.*;

public class fibonachi6 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int b = 0;
        int c = 1;
        int a = 0;
        while (b < n) {
              a = b;
            b = c;
            c = a + b;
          
            System.out.println(a);
        }
    }
}
