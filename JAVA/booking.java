import java.util.*;
import java.lang.*;
class Reservation{
	private int Seats = 20;
	synchronized void seatReservation(int reqSeats){
		System.out.println("Thread name = "+ Thread.currentThread().getName());
		if( reqSeats > Seats ){
			System.out.println("Requested seats not available");
		}else{
			Seats = Seats - reqSeats;
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("Seats reserved : "+reqSeats+" Available seats : "+Seats); 
		}
	}
}
class myThread extends Thread{
	private Reservation reserve;
	private int reqSeats;
	myThread(Reservation reserve, int reqSeats){
		this.reserve = reserve;
		this.reqSeats = reqSeats;
	}
	public void run(){
		reserve.seatReservation(reqSeats);
	}
}
public class booking {
	public static void main(String args[]){
		int s1=3, s2=8, s3=10;
		Reservation reserve = new Reservation();
		myThread t1 = new myThread(reserve, s1);
		t1.start();
		myThread t2 = new myThread(reserve, s2);
		t2.start();
		myThread t3 = new myThread(reserve, s3);
		t3.start();	
	}
}