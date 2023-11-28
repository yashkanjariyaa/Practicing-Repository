import java.util.*;
    public class exp6_a{
        static int count = 0;
        public exp6_a(){
            count++;
        }
    public static void main(String argss[]){
        exp6_a myObj1 = new exp6_a();
        exp6_a myObj2 = new exp6_a();
        exp6_a myObj3 = new exp6_a();
        exp6_a myObj4 = new exp6_a();
        System.out.println(count);
    }
    }