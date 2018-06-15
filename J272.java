package day6_15;

public class J272 extends Thread{
	public static void main(String[] args) {
		J272 t=new J272() {
			public void run() {
				System.out.println("自定义的任务");
			}
		};
		
		t.start();
	}
}
