package day6_15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class J284 {
	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(2);
		for(int i=0;i<10;i++) {
			pool.submit(new A());
			pool.submit(new B());
			pool.submit(new C());
		}
	}
}
class A implements Runnable{
	public void run() {
		System.out.print("A");
	}
}
class B implements Runnable{
	public void run() {
		System.out.print("B");
	}
}
class C implements Runnable{
	public void run() {
		System.out.print("C");
	}
}