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


        Thread A1 = new Thread(() -> {
            try {
                foo1.first(() -> System.out.print("first"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread B1 = new Thread(() -> {
            try {
                foo1.second(() -> System.out.print("second"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread C1 = new Thread(() -> {
            try {
                foo1.third(() -> System.out.print("third"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread A2 = new Thread(() -> {
            try {
                foo2.first(() -> System.out.print("first"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread B2 = new Thread(() -> {
            try {
                foo2.second(() -> System.out.print("second"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread C2 = new Thread(() -> {
            try {
                foo2.third(() -> System.out.print("third"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


       /*C.start();
        A.start();
        B.start();*/

        C1.start();
        B1.start();
        A1.start();

        /*B2.start();
        C2.start();
        A2.start();*/


    }
}


