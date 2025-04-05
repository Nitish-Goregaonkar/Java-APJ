package Multithreading;
public class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.increment();
        System.out.println("Count: " + counter.getCount());
    }
}
