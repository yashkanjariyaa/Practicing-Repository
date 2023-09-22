import java.util.Scanner;
public class calculator{
    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        int a = myobj.nextInt();
        int b = myobj.nextInt();
        String op = myobj.next();
        int ans=0;
        switch(op){
            case "+" :
             ans = a+b;
             break;
            case "-" :
             ans = a-b;
             break;
            case "/" :
             ans = a/b;
             break;
            case "%" :
             ans = a%b;
             break;
            case "*" :
             ans = a*b;
             break;
            default :
            ans = 0;
         }
         System.out.println(ans);
    }
}