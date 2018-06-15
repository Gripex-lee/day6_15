package day6_15;

public class J254 {
	public static void main(String[] args) {
		Thread t1=new Thread() {
			public void run() {
				for(int i=0;i<100;i++) {
					System.out.println("第一个线程："+getName());
				}
			}
		};
		
		Thread t2=new Thread() {
			public void run() {
				for(int i=0;i<100;i++) {
					System.out.println("第二个线程："+getName());
				}
			}
		};
		//查看线程(第一第二个随机排)
		//修改优先级(范围1-10,5为默认优先级)
		t1.setPriority(10);//最高优先级
		t2.setPriority(1);//最低优先级
		t1.start();
		t2.start();
	}
}
