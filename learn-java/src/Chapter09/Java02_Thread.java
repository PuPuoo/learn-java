package Chapter09;

public class Java02_Thread {
    public static void main(String[] args) {
        // TODO 线程 执行方式（串行 | 并发）
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        // 并发
        t1.start();
        t2.start();

        // 串行
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("main 线程执行完毕");
    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread-1: " + Thread.currentThread().getName());
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread-2: " + Thread.currentThread().getName());
    }
}