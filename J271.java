package day6_15;

public class J271 {
	public static void main(String[] args) {
		new Thread() {
			public void run() {
				System.out.println(getName());
			}
		}.start();
		
		new Thread() {
			public void run() {
				System.out.println(getId());
			}
		}.start();
		
		new Thread("name:myThread") {
			public void run() {
				System.out.println(getName());
				System.out.println("MyId:"+getId());
			}
		}.start();
	}
}
