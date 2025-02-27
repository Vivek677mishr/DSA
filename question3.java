
import java.util.Scanner;

public class question3{
    public static void main(String[] args) {
     Scanner Sc = new Scanner(System.in);
     int marks=Sc.nextInt();
if(marks>=90){
    System.out.println("Excellent");
}
else if(marks>=80 && marks<90){
     System.out.println("good");
}
else if(marks>=70 && marks<80){
     System.out.println("fair");
}
else if(marks>=60 && marks<70){
     System.out.println("expectation");
}
else{
    System.out.println("poor");
}
    }
}