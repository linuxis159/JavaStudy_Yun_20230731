package multithread;

public class Main {
    static int total = 0;
    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();
        calculateFactorialThree(1000000000L);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
    static void calculateFactorial(long n) throws InterruptedException {

        long result = 0;
        for(long i=0; i<n; i++){
            result += i;
        };
        System.out.println(result);

    }
    static void calculateFactorialMultiThread(long n) throws InterruptedException {
        long target = n / 2;
        Runnable task1 = () -> {
            long result = 0;
            for(long i=0; i<target; i++){
                result += i;
            };
            System.out.println(result);
        };
        Runnable task2 = () -> {
            long result = 0;
            for(long i=target; i<target*2; i++){
                result += i;
            };
            System.out.println(result);
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("end");

    }


    static void calculateFactorialThree(long n) throws InterruptedException {
        long target = n / 3;
        Runnable task1 = () -> {
            long result = 0;
            for(long i=0; i<target; i++){
                result += i;
            };
            System.out.println(result);
        };
        Runnable task2 = () -> {
            long result = 0;
            for(long i=target; i<target*2; i++){
                result += i;
            };
            System.out.println(result);
        };
        Runnable task3 = () -> {
            long result = 0;
            for(long i=target*2; i<target*3; i++){
                result += i;
            };
            System.out.println(result);
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        Thread t3 = new Thread(task3);
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println("end");

    }
}
