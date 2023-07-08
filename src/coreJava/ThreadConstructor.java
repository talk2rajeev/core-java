package coreJava;

class MyConstructorThread extends Thread{
    public MyConstructorThread(String name) {
        super(name);
    }
    public void run(){
        System.out.println("MyConstructorThread running...");
    }
}

class MyRunnableThread implements Runnable{
    public void run(){
        System.out.println("MyRunnableThread running...");
    }
}

public class ThreadConstructor {
    public static void main(String[] args) {
        MyConstructorThread t1 = new MyConstructorThread("Thread1");

        MyRunnableThread mth1 = new MyRunnableThread();
        Thread th1 = new Thread(mth1, "Rajeev");

        t1.start();
        System.out.println(t1.getName());
        th1.start();
        System.out.println(th1.getName());

    }

}
