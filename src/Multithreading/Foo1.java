package Multithreading;

import java.util.concurrent.Semaphore;

public class Foo1 {
    Semaphore s1 = new Semaphore(0);
    Semaphore s2 = new Semaphore(0);

    public void first(Runnable a) throws InterruptedException {
        a.run();
        s1.release();

    }

    public void second(Runnable b) throws InterruptedException {
        s1.acquire();
        b.run();
        s2.release();

    }

    public void third(Runnable c) throws InterruptedException {
        s2.acquire();
        c.run();
    }
}
