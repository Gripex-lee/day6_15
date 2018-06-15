package day6_15;

public class J280 {
    private int a;
    public static void main(String[] args) {
    	J280 t = new J280();
        for(int i =0;i<2;i++) {
            Thread t1 = new Inc(t);
            t1.start();
            Thread t2 = new Dec(t);
            t2.start();
        }
    }

    public void inc() {
        a++;
        System.out.println(Thread.currentThread().getName() + ":inc" + a);
    }

    public void dec() {
        a--;
        System.out.println(Thread.currentThread().getName() + ":dec" + a);
    }

}

class Inc extends Thread {
    private J280 a;

    Inc(J280 a) {
        this.a = a;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            a.inc();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Dec extends Thread {
    private J280 a;
    Dec(J280 a) {
        this.a = a;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            a.dec();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
