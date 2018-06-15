package day6_15;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
/** 
 * Created by tl on 17/3/3. 
 */  
public class J257{  
	public static void main(String[] args) {  
        BlockingQueue<Integer> queue =new ArrayBlockingQueue<Integer>(10);  
        boolean flag;  
        for(int i=1;i<=20;i++){  
            try {  
                flag = queue.offer(i,5,TimeUnit.SECONDS);  
                System.out.println(i+":"+flag);  
            } catch (InterruptedException e) {  
                e.printStackTrace();  
            }  
        }  
        
        BlockingQueue<Integer>  second=new ArrayBlockingQueue<Integer>(10);  
        for(int i=0;i<10;i++){  
        	second.offer(i);  
        }  
          
        for(int i=1;i<=20;i++){  
            Integer in;  
            try {  
                in = second.poll(1,TimeUnit.SECONDS);  
                System.out.println(in);  
            } catch (InterruptedException e) {  
                e.printStackTrace();  
            }  
        }
    } 
} 
