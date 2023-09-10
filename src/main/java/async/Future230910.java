package async;

import java.util.concurrent.*;

public class Future230910 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //exampleFuture();
        exampleCompletableFuture();

    }
    static void exampleFuture() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<Long> future = executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName());
            long result = 0;
            for(long i =0; i < 10000000000L; i++){
                result += i;
            }
            System.out.println(Thread.currentThread().getName());
            return result;
        });
        //blocked
        long result = future.get();
        System.out.println("main End, result: " + result);
    }

    static void exampleCompletableFuture() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName());
            long result = 0;
            for(long i =0; i < 10000000000L; i++){
                result += i;
            }
            System.out.println(Thread.currentThread().getName());
            return result;
        }).thenAcceptAsync(result -> {
            System.out.println("callback Result : " + result);
        });


        anotherJob();
        System.out.println("Waiting for the result...");
        try {
            future.join();
        } catch(CompletionException e){
            System.err.println("An error occurred: " + e.getCause().getMessage());
        }
        System.out.println("main End");
    }
    static void anotherJob(){
        long result = 0;
        for(int i=0; i<21000000; i++){
            result = result + i - i * 2 +3 % 3 / 2 * 3 + 2;
        }
        System.out.println("another Job : "+result);
    }
}
