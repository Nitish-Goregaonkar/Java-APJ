package Multithreading;

public class PriorityMethods extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}

class main1{
    public static void main(String[] args) {
        PriorityMethods t1=new PriorityMethods();
        PriorityMethods t2=new PriorityMethods();
        PriorityMethods t3=new PriorityMethods();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.setPriority(10);
        t2.setPriority(6);
        t3.setPriority(7);

        t1.start();
        t2.start();
        t3.start();
    }
}