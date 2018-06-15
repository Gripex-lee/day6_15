package day6_15;

public class J265 {
	public static void main(String[] args) {
		new Thread() {
			public void run() {
				System.out.println("线程名："+getName());
			}
		}.start();
	}
}
