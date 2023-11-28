import java.util.*;
import java.lang.*;
class myThread extends Thread {
    int n;
    myThread(int n){
        this.n = n;
    }
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println((i+1)*n);
        }
        System.out.println("*********");
    }
}
public class threads {
    public static void main(String args[]){
        myThread t1 = new myThread(5);
        myThread t2 = new myThread(7);
        myThread t3 = new myThread(13);
        t1.start();
        try{
            Thread.sleep(100);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        t2.start();
        try{
            Thread.sleep(100);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        t3.start();
    }
}
