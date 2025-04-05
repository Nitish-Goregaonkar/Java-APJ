package Multithreading;

public class SynchronizedMethod {
    public void printTable(int n){
        for (int i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }
}
class thread1 extends Thread{
    SynchronizedMethod t;
    thread1(SynchronizedMethod t){
      this.t=t;
    }

    @Override
    public void run() {
        t.printTable(5);
    }
}
class thread2 extends Thread{
    SynchronizedMethod t;
    thread2(SynchronizedMethod t){
        this.t=t;
    }

    @Override
    public void run() {
        t.printTable(2);
    }
}

class mainmethod{
    public static void main(String[] args) {
      SynchronizedMethod obj=new SynchronizedMethod();

      thread1 t1=new thread1(obj);
      thread2 t2=new thread2(obj);

      t1.start(); t2.start();
    }
}
