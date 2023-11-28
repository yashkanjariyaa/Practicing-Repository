import java.util.*;
import java.lang.*;
class myThread extends Thread
{
    private char c;
    private int n;
    public myThread(int n, char c){
        this.n = n;
        this.c = c;
    }
    public void run(){
        for(int i = 0; i < n; i++){
            System.out.print(c+"");
            try
            {
                Thread.sleep(200);
            }catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
public class threadsPattern {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int temp = sc.nextInt();
        myThread t1 = new myThread(temp, '*');
        myThread t2 = new myThread(temp, '/');
        t1.start();
        try
        {
            Thread.sleep(1);
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        t2.start();
    }
}
