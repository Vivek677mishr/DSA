import java.util.*;
public class array1{
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);

int n1= Sc.nextInt();
int[] a1 = new int[n1];

for(int i=0; i<n1;i++){
    a1[i]=Sc.nextInt();
}
int n2=Sc.nextInt();
int[] a2= new int[n2];
for(int i=0;i<n2;i++){
    a2[i]=Sc.nextInt();
}
int[] a3=new int[n2];

int c=0;

int i=a1.length-1;
int j=a2.length-1;
int k=a3.length-1;

while(k>=0){
    int d=0;
    int a1v=i>=0?a1[i] :0;
    if(a2[j]+c>=a1v){
        d=a2[j]+c-a1v;
        c=0;
    } else{
        d=a2[j]+c+10-a1v;
        c=-1;
    }
        
        a3[k]=d;
        i--;
        j--;
        k--;

}
int ind=0;
while(ind<a3.length){
    if(a3[ind]==0){
        ind++;
    }else{
        break;
    }
}
while(ind<a3.length){
    System.out.println(a3[ind]);
    ind++;
}



    }
}