package Multithreading;

public class IsaliveMethod extends Thread{
    @Override
    public void run() {
        String n = Thread.currentThread().getName();
        for (int i = 1; i <= 3; i++) {
            System.out.println(n);
        }
    }
}
class Example5 {
    public static void main(String[] args) {
        IsaliveMethod t1 = new IsaliveMethod();
        IsaliveMethod t2 = new IsaliveMethod();
        IsaliveMethod t3 = new IsaliveMethod();

        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");

        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(t1.isAlive());
        t2.start();
        t3.start();

        String n=Thread.currentThread().getName();
        for(int i=1;i<=3;i++){
            System.out.println(n);
        }
    }
}

