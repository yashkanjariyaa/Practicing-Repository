import java.util.*;
import java.lang.*;
class myThread extends Thread{
    int n;
    int[] array;
    public void run(){
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	array = new int[n];
	fibThread fib = new fibThread(n,array);
	fib.start();
	try{
		fib.join();
	}catch(InterruptedException e){
		e.printStackTrace();
	}
	for(int i = 0; i < array.length; i++){
		System.out.println(array[i]);
	}
    }
}
class fibThread extends Thread{
    int n, n1 = 0, n2 = 1, temp;
    int[] array;
    fibThread(int n, int[] array){
	this.n = n;
	this.array = array;
    }
    public void run(){
	for(int i = 0; i< n; i++){
		array[i] = n1;
		temp = n1 + n2;
		n1 = n2;
		n2 = temp;
	}
    }
}
public class fibonacci{
    public static void main(String args[]){
	myThread t = new myThread();
	t.start();
    }
}