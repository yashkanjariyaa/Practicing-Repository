import java.util.Scanner;
public class factorial{
    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = myobj.nextInt();
        int f=1,i;

            for(i=1;i<=n;i++){
                f*=i;
            }

            System.out.println(f);
    } 
}