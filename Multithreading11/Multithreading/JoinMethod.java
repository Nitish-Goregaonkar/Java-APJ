package Multithreading;

public class JoinMethod extends Thread {
    @Override
    public void run() {
        String n=Thread.currentThread().getName();
        for(int i=1;i<=3;i++){
            System.out.println(n);
        }
    }
}


class Example1 {
    public static void main(String[] args) {
        JoinMethod t1 = new JoinMethod();
        JoinMethod t2 = new JoinMethod();
        JoinMethod t3 = new JoinMethod();

        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");


        t2.start();
        try {
            t2.join();
        }
        catch(InterruptedException e){

        }
        t1.start();
        t3.start();

        String n=Thread.currentThread().getName();
        for(int i=1;i<=3;i++){
            System.out.println(n);
        }
    }
}
