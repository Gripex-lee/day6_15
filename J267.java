package day6_15;

public class J267 {
	public static void main(String[] args) {
	       System.out.println("Exit thread wonderful!");
	       exitByFlag();
	   }
	    private static void exitByFlag() {
	       Exit a = new Exit(Exit.class.getSimpleName());
	       a.start();
	       try {
	           Thread.sleep(1000);
	           a.isExit = true;
	           a.join();//Thread类中的join方法的主要作用就是同步，它可以使得线程之间的并行执行变为串行执行。
	           System.out.println("exit!");
	       } catch (InterruptedException e) {
	           e.printStackTrace();
	       }
	   }
}
class Exit extends Thread {
	public volatile boolean isExit = false;
	public Exit(String name) {
	    super(name);
	}
	public void run() {
	    while (!isExit) {
	        System.out.println("Running");
	    }
	}
}
