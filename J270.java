package day6_15;

public class J270 {
	public static void main(String[] args) {
		J270 x=new J270();
		x.testCurrent();
		Thread t=new Thread() {
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		};
		t.start();//启动
	}
	public void testCurrent() {
		System.out.println(Thread.currentThread().getName());
	}
}
