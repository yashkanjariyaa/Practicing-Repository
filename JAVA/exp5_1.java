
import java.util.*; 
public class exp5_1 {
    public static int calcPower(int base,int power){
    if(power==0)
        return 1; 
    if(base==0) 
            return 0;
    else
        return base*calcPower(base,power-1);
    }
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number and its power"); int x=sc.nextInt();
    int n=sc.nextInt(); int y=calcPower(x,n);
    System.out.println("y = "+y);
    }
    }
    