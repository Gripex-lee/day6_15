package day6_15;

public class J260 {
	public static void main(String[] args) {
		Thread t1=new Thread("one") {
			public void run() {
				for(int i=0;i<100;i++) {
					System.out.println(this.getName()+"...1111");
				}
			}
		};
		Thread t2=new Thread("two") {
			public void run() {
				for(int i=0;i<100;i++) {
					System.out.println(this.getName()+"...2222");
				}
			}
		};
		Thread t3=new Thread("three") {
			public void run() {
				for(int i=0;i<100;i++) {
					System.out.println(this.getName()+"...3333");
				}
			}
		};
		
		t1.setPriority(1);
		t2.setPriority(10);
		t3.setPriority(10);
		t1.start();
		t2.start();
		t3.start();
	}
}
