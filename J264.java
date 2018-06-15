package day6_15;

public class J264 {
	public static void main(String[] args) throws InterruptedException {
		//创建State对象  
        ThreadState state=new ThreadState();  
        //利用State对象创建Thread对象  
        Thread thread=new Thread(state);  
        System.out.println("新建："+ thread.getState());  
          
        //调用thread对象的start（）方法，启动新线程  
        thread.start();  
        System.out.println("启动："+ thread.getState());  
          
        //当前线程休眠0.1秒，使新线程运行waitForASecond（）方法  
        Thread.sleep(100);  
        System.out.println("计时："+thread.getState());  
          
        //当前线程休眠1秒，使新线程运行waitForYears（）方法  
        Thread.sleep(1000);  
        System.out.println("等待："+thread.getState());  
          
        state.notifyNow();  
        System.out.println("唤醒："+thread.getState());  
          
        //当前线程休眠1秒，使新线程结束  
        Thread.sleep(1000);  
        System.out.println("终止："+thread.getState());
	}
}

class ThreadState implements Runnable{  
    public synchronized void waitForASecond() throws InterruptedException{  
        //使当前线程等待0.5秒或其他线程调用notify（）或notifyAll（）方法  
        wait(500);  
    }  
    public synchronized void waitForYears() throws InterruptedException{  
        //使当前线程永久等待，知道其他线程调用notify（）或notifyAll（）方法  
        wait();  
    }  
    public synchronized void notifyNow() throws InterruptedException{  
        //唤醒由调用wait（）方法进入等待状态的线程  
        notify();     
    }  
    @Override  
    public void run() {  
        try {  
            //在新线程中运行waitForASecond（）方法  
            waitForASecond();  
            //在新线程中运行waitForYears（）方法  
            waitForYears();  
        } catch (InterruptedException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }    
    }  
}
