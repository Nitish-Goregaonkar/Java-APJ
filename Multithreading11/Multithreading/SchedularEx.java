
public class SchedularEx extends Thread{
    @Override
    public void run() {
        String n=Thread.currentThread().getName();
        for(int i=1;i<=3;i++){
            System.out.println(n);
        }
    }
}
class Example{
    public static void main(String[] args) {
        SchedularEx t1=new SchedularEx();
        SchedularEx t2=new SchedularEx();
        SchedularEx t3=new SchedularEx();

        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");

        t1.start();
        t2.start();
        t3.start();

        String n=Thread.currentThread().getName();
        for(int i=1;i<=3;i++){
            System.out.println(n);
        }
    }
}
