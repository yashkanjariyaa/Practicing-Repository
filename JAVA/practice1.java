import java.util.*;
    public class practice1{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int largest = (a>b && a>c) ? a : ((b>c && b>a) ? b : ((c>b && c>a) ? c : 0 ));
            System.out.println(largest);
        }
    }