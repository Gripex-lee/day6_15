package day6_15;

public class J268 {
    public static void main (String [] args) throws InterruptedException {
    Thread t =new Thread(new chaDui(),"线程１");//创建线程
        t.start(); //开启线程
        for(int i=1;i<6;i++){
            System.out.println(Thread.currentThread().getName()+"输入:"+i);
            if(i==2){
                t.join(); //调用join（）方法
            }
            Thread.sleep(500); //线程休眠500毫秒
        }
    }
}

class  chaDui  implements  Runnable{
    public void run(){
        for (int i=1;i<6;i++){
            System.out.println(Thread.currentThread().getName()+"输入:"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
