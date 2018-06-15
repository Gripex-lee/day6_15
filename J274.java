package day6_15;

/*
 * join方法的功能就是使异步执行的线程变成同步执行。
 * 也就是说，当调用线程实例的start方法后，这个方法会立
 * 即返回，如果在调用start方法后后需要使用一个由这个
 * 线程计算得到的值，就必须使用join方法。如果不使用join
 * 方法，就不能保证当执行到start方法后面的某条语句时，
 * 这个线程一定会执行完。而使用join方法后，
 * 直到这个线程退出，程序才会往下执行。
 */
public class J274 {
    public static void main(String[] args) throws InterruptedException {
        Thread th1 = new Thread01();
        Thread th2 = new Thread02();
        th1.start();
        th1.join();
        System.out.println("Thread01运行结束。。。");
        th2.start();
        th2.join();
        System.out.println("Thread02运行结束。。。");
    }
}
class Thread01 extends Thread{
    
    public void run() {
    	for(int i=0;i<100;i++) {
    		System.out.println("Thread01...running");
    	}
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Thread02 extends Thread{
    public void run() {
    	for(int i=0;i<100;i++) {
    		System.out.println("Thread02...running");
    	}
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}
