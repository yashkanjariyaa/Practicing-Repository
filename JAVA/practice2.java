import java.util.*;
import java.lang.Thread;
class Counter{
    private int count = 0;

    public synchronized void increment(){
        count++;
    }

    public synchronized int getCount(){
        return count;
    }
}
class incrementThread extends Thread {
    private Counter counter;
    public incrementThread(Counter counter){
        this.counter = counter;
    }
    public void run(){
        for (int i=0; i<=1000; i++){
            counter.increment();
        }
    }
}
public class practice2 {
    public static void main(String[] args) throws InterruptedException{
        Counter counter = new Counter();
        incrementThread thread1 = new incrementThread(counter);
        incrementThread thread2 = new incrementThread(counter);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(counter.getCount());
    }
}