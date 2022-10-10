package Multithreading;
import java.util.concurrent.CountDownLatch;
class Foo {
    private final CountDownLatch cdl1 = new CountDownLatch(1);
    private final CountDownLatch cdl2 = new CountDownLatch(1);

    public void first(Runnable a) throws InterruptedException {
        a.run();
        cdl1.countDown();
    }
    public void second(Runnable b) throws InterruptedException {
        cdl1.await();
        b.run();
        cdl2.countDown();
    }
    public void third(Runnable c) throws InterruptedException {
        cdl2.await();
        c.run();
    }
}
