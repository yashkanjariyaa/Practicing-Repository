import java.util.Scanner;
public class fibonacci{
   public static void main(String[] args){
     Scanner myobj = new Scanner(System.in);
     int n = myobj.nextInt();
     int i, a=1, b=0, f;
     System.out.println("0"+"\n1");
     for(i=1;i<=n;i++){
        f=a+b;
        b=a;
        a=f;
        System.out.println(f);
     }
   } 
}