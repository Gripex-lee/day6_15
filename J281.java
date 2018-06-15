package day6_15;

public class J281 {
	public static void main(String[] args) {
		new Thread("one") {
			public void run() {
				for(int i=0;i<100;i++) {
					System.out.println(i);
				}
			}
		}.start();
		
		new Thread("two") {
			public void run() {
				for(int i=0;i<100;i++) {
					System.out.println(i);
				}
			}
		}.start();
	}
}
