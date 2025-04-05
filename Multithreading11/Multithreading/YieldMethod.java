package Multithreading;

class YieldMethod extends Thread{
    @Override
    public void run() {
        String n=Thread.currentThread().getName();
        for(int i=1;i<=3;i++){
            System.out.println(n);
            Thread.yield();
        }
    }
}
class YieldMethod1 extends Thread{
    @Override
    public void run() {
        String n=Thread.currentThread().getName();
        for(int i=1;i<=3;i++){
            System.out.println(n);
        }
    }
}
class Example3 {
    public static void main(String[] args) {
        YieldMethod t1 = new YieldMethod();
        YieldMethod1 t2 = new YieldMethod1();


        t1.setName("thread 1");
        t2.setName("thread 2");
        t1.start();
        t2.start();

    }
}