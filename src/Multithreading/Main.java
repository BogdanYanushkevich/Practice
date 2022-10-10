package Multithreading;

public class Main {
    public static void main(String[] args) {
        Foo foo = new Foo();
        Foo foo1 = new Foo();
        Foo foo2 = new Foo();

        Thread A = new Thread(() -> {
            try {
                foo.first(() -> System.out.print("first"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread B = new Thread(() -> {
            try {
                foo.second(() -> System.out.print("second"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread C = new Thread(() -> {
            try {
                foo.third(() -> System.out.print("third"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        C.start();
        A.start();
        B.start();
    }
}


