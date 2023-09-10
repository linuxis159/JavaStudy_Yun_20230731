package async;

import java.util.concurrent.*;

public class FutureExceptionProcess {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //exampleFuture();

        exampleCompletableFuture();
    }

    static void exampleFuture() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<Long> future = executorService.submit(() -> {
            throw new RuntimeException("");
        });
        //blocked
        long result = future.get();
        System.out.println("main End, result: " + result);
    }

    static void exampleCompletableFuture() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        CompletableFuture<?> future = CompletableFuture.supplyAsync(() -> {
            return "예외발생안함";

        }).exceptionally(ex -> {
            System.err.println("예외처리" + ex.getMessage());
            return null;
        }).thenAcceptAsync(result -> {
            if(result == null)
                System.out.println("is null");

            else
                System.out.println("is not null");
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
