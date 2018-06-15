package day6_15;

import java.text.SimpleDateFormat;
import java.util.Date;

public class J259 {
	public static void main(String[] args) {
        Thread t1 =new Thread(){
           public void run() {
                while(true){
                       SimpleDateFormat time =new SimpleDateFormat("yy-MM-dd HH:mm:ss");
                       Date now =new Date();
                       System.out.println(time.format(now));
                       try {
                           Thread.sleep(5000);
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                   }
           }
        };
        t1.setDaemon(true);//守护线程--也称“服务线程”，在没有用户线程可服务时会自动离开。优先级：守护线程的优先级比较低，用于为系统中的其它对象和线程提供服务。
        t1.start();
        try {
           //如果不阻塞main 只剩下守护进程的时候 gc直接调出 结束进程了
            Thread.sleep(10000000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
   }
}
