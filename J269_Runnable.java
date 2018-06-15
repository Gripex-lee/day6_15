package day6_15;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class J269_Runnable extends JFrame implements Runnable{  
    public void run(){  
        JPanel panel = new JPanel();  //画板
        panel.setSize(600, 600);//设置画板尺寸  
        //this代表独享t,谁调用run方法this指的就是谁  
        this.setContentPane(panel); //将panel对象添加到JFrame中  
        //设置背景变换  
        int count =0;  
        while(true){  
            count = (count==0)? 1:0;//也可以利用求余数的方法  
            switch(count){  
                case 0:  
                    panel.setBackground(Color.YELLOW);  
                    break;  
                case 1:  
                    panel.setBackground(Color.WHITE);  
            }  
            try{  
                Thread.sleep(10);//100毫秒切换一次  
            }catch(InterruptedException e){  
                e.printStackTrace();  
            }  
        }  
    }  
    public static void main(String[] args) {  
    	J269_Runnable t = new J269_Runnable();  
        t.setSize(600, 600);//由于test继承了JFrame所以可以直接调用JFrame中的方法  
        t.setAlwaysOnTop(true);//总在最上  
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置默认关闭操作  
        t.setLocationRelativeTo(null);//设置相对位置  
        t.setVisible(true);//设置窗口可见 
        Thread show = new Thread(t);  
        show.start();  
    }  
      
}  
