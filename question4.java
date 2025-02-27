
import java.util.*;

public class question4 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
       
        for (int i = 0; i < t; i++) {
            int f = Sc.nextInt();
             int count =0;
            for (int j = 2; j < f; j++) {
               if(f%j==0){
                count++;
               }
            }
            if(count!=0){
                System.out.println("not prime");
            }else{
                 System.out.println(" prime");
            }
        }
    }
}