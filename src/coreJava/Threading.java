package coreJava;

class MyThread extends Thread {
    @Override
    public void run() {
        int i=0;
        while(i<20) {
            System.out.println("MyThread is running");
            i++;
        }
    }
}

class RunnableThread implements Runnable {
    public void run() {
        int i=0;
        while(i<20) {
            System.out.println("This is RunnableThread");
            i++;
        }
    }
}
public class Threading {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();

        RunnableThread rt1 = new RunnableThread();
        Thread th1 = new Thread(rt1);

        t1.start();
        th1.start();

    }
}
