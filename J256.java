package day6_15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class J256 {
	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(2);
		for(int i=0;i<5;i++) {
			pool.submit(new runnable());
		}
	}
}

class runnable implements Runnable{
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
	}
}