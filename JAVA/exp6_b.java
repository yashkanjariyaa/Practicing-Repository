import java.util.*;
    public class exp6_b{
        public void myMethod(int length, int breadth){
            System.out.println(length*breadth);
        }
        public void myMethod(int side){
            System.out.println(side*side);
        }
        public static void main(String args[]){
            exp6_b rect = new exp6_b();
            exp6_b sqr = new exp6_b();
            rect.myMethod(5,4);
            sqr.myMethod(4);
        }
    }