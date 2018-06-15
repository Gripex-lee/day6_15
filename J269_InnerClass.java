package day6_15;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class J269_InnerClass extends JFrame{  
    public static void main(String[] args) {  
        JFrame frame = new JFrame("测试窗口");  
        frame.setSize(500, 500);  
        frame.setAlwaysOnTop(true);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setLocationRelativeTo(null);  
        JPanel panel = new JPanel();  
        panel.setSize(500, 500);  
//      frame.add(panel); 两句代码可以互换  
        frame.setContentPane(panel);  
        frame.setVisible(true);//窗口已经建立完成  
        Thread t = new Thread(){  
            public void run(){  
                int count = 0;  
                while(true){  
                    count = (count ==0)? 1:0;  
                    switch(count){  
                    case 0:  
                        panel.setBackground(Color.BLACK);  
                        break;  
                    case 1:  
                        panel.setBackground(Color.WHITE); 
                    }  
                    
                    try {  
                        Thread.sleep(100);//200毫秒切换一次  
                    } catch (InterruptedException e) {  
                        e.printStackTrace();  
                    }  
                }  
            }  
        };  
        t.start();  
          
    }  
} 
