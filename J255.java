package day6_15;

public class J255 {
	public static void main(String[] args) {
		ClassRoom x=new ClassRoom();
		x.student.start();
		x.teacher.start();
	}
}

class ClassRoom implements Runnable{
	Thread student,teacher;
	ClassRoom(){
		student = new Thread(this);
		teacher = new Thread(this);
	}
	public void run() {
		if(Thread.currentThread()==student) {
			System.out.println("在睡觉");
			try {
				Thread.sleep(2*60*60*1000);
			} catch (InterruptedException e) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				System.out.println("被吵醒了！");
			}
			System.out.println("开始听课");
		}else if(Thread.currentThread()==teacher){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("上课");
			student.interrupt();
		}
	}
}