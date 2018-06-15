package day6_15;

import java.util.concurrent.ArrayBlockingQueue;  

/** 
 * Created by tl on 17/3/3. 
 */  
public class J258{  
    //final成员变量表示常量，只能被赋值一次，赋值后值不再改变。  
    private static final int queueSize = 5;  
    private static final ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(queueSize);  
    private static final int produceSpeed = 2000;//生产速度(越小越快)  
    private static final int consumeSpeed = 10;//消费速度(越小越快)  
  
    //生产者  
    public static class Producer implements Runnable {  
        @Override  
        public void run() {  
            while (true) {  
                try {  
                    System.out.println("生产商品，还能够放商品：" + (queueSize - queue.size()) + "个");  
                    queue.put("1个商品");  
                    System.out.println("生产了一个商品，还能放商品：" + (queueSize - queue.size()) + "个");  
                    Thread.sleep(produceSpeed);  
                } catch (InterruptedException e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
    }  
  
    //消费者  
    public static class Consumer implements Runnable {  
  
        @Override  
        public void run() {  
            while (true) {  
                try {  
                    System.out.println("A准备买商品，还剩商品" + queue.size() + "个");  
                    queue.take();  
                    System.out.println("A购买了1个商品，还剩商品" + queue.size() + "个");  
                    Thread.sleep(consumeSpeed);  
  
                    System.out.println("B准备买商品，还剩商品" + queue.size() + "个");  
                    queue.take();  
                    System.out.println("B购买了1个商品，还剩商品" + queue.size() + "个");  
                    Thread.sleep(consumeSpeed);  
  
                    System.out.println("C准备买商品，还剩商品" + queue.size() + "个");  
                    queue.take();  
                    System.out.println("C购买了1个商品，还剩商品" + queue.size() + "个");  
                    Thread.sleep(consumeSpeed);  
                } catch (InterruptedException e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
    }  
    public static void main(String[] args) {  
        Thread producer = new Thread(new Producer());  
        Thread consumer = new Thread(new Consumer());  
        producer.start();  
        consumer.start();  
    }  
}  
