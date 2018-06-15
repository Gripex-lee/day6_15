package day6_15;

public class J273 {
	public static void main(String[] args) {
		myRunnable x=new myRunnable();
		Thread y=new Thread(x);
		y.start();
	}
}	

class myRunnable implements Runnable{
	public void run() {
		System.out.println("Runnable接口");
	}
}
