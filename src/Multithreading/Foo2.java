package Multithreading;

public class Foo2 {
    public int counter = 1;


    public synchronized void first(Runnable a) throws InterruptedException {
        while (counter != 1) {
            wait();
        }
        a.run();
        counter++;
        notifyAll();
    }

    public synchronized void second(Runnable b) throws InterruptedException {
        while (counter != 2) {
            wait();
        }
        b.run();
        counter++;
        notifyAll();
    }

    public synchronized void third(Runnable c) throws InterruptedException {
        while (counter != 3) {
            wait();
        }
        c.run();
        notifyAll();
    }
}
