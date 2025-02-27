
import java.util.*;

public class quetion5 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int s = Sc.nextInt();
        int b = Sc.nextInt();

        for (int i = s; i <= b; i++) {
            int count = 0;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
             

            }
            if(count==0){
                System.out.println(i);
             }
        }
    }
}
