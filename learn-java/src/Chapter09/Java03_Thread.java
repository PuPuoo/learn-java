package Chapter09;

public class Java03_Thread {
    public static void main(String[] args) {
        MyThread3 t3 = new MyThread3("线程1");
        t3.start();

        // 构建线程的方式二：lambda
        Thread t4 = new Thread(() -> {
            System.out.println("线程2执行");
        });
        t4.start();

        // 构建线程的方式二：实现Runnable接口
        Thread t5 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程3执行");
            }
        });
        t5.start();
    }
}

// 构建线程的方式一：继承 Thread 类
class MyThread3 extends Thread {
    private String threadName;

    public MyThread3(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        System.out.println(threadName + "执行");
    }
}
