package async;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.rmi.server.LogStream.log;

public class Async {

    private static ExecutorService executorService;
    // CompletionHandler를 구현한다.
    private static final CompletionHandler<String, Void> completionHandler = new CompletionHandler<>() {
        // 작업 1이 성공적으로 종료된 경우 불리는 콜백 (작업 2)
        @Override
        public void completed(String result, Void attachment) {
            log("작업 2 시작 (작업 1의 결과: " + result + ")");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            log("작업 2 종료");
        }

        // 작업 1이 실패했을 경우 불리는 콜백
        @Override
        public void failed(Throwable exc, Void attachment) {
            log("작업 1 실패: " + exc.toString());
        }
    };

    public static void main(String[] args) {

        executorService = Executors.newCachedThreadPool();

        // 작업 1
        executorService.submit(() -> {
            log("작업 1 시작");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            log("작업 1 종료");

            String result = "Alice";
            if (result.equals("Alice")) { // 작업 성공
                completionHandler.completed(result, null);
            } else { // 작업 실패
                completionHandler.failed(new IllegalStateException(), null);
            }
        });

        // 별개로 돌아가는 작업 3
        log("작업 3 시작");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log("작업 3 종료");
    }

    private static void log(String content) {
        System.out.println(Thread.currentThread().getName() + "> " + content);
    }

}
