package day6_15;

public class J266 {
	public static void main(String[] args) {
		Thread t=new Thread() {
			public void run() {
				System.out.println("休眠5秒");
				try {
					sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("休眠结束!");
			}
		};
		t.start();
	}
}
