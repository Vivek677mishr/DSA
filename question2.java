
import java.util.*;

public class question2 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        int n = Sc.nextInt();
        int g = n - 1;
        for (int i = 1; i <= n; i++) {

            if (i == 1 || i == n) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < g; j++) {
                    System.out.print(" ");

                }
                System.out.print("*");
            }
            g--;
            System.out.println();

        }
    }

}
