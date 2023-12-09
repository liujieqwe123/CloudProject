package Async;

import java.util.concurrent.*;

public class CompletableFutureTestMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("main方法开始,当前线程:"+Thread.currentThread().getName());
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5,
                5,
                60,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(),
                new ThreadPoolExecutor.CallerRunsPolicy());
        SendTodoService sendTodoService = new SendTodoService();

        CompletableFuture<Integer> step1 = CompletableFuture.supplyAsync(() -> {
            return sendTodoService.sendToMessage("step1",1);
        }, threadPoolExecutor);
        CompletableFuture<Integer> step3 = CompletableFuture.supplyAsync(() -> {
            return sendTodoService.sendToMessage("step3",3);
        }, threadPoolExecutor);
        CompletableFuture<String> stringCompletableFuture = step1.thenApplyAsync(step1Result -> {
            System.out.println("step1完成了，执行thenApplyAsync方法，当前线程:" + Thread.currentThread().getName());
            return "step1的结果:" + step1Result;
        }, threadPoolExecutor);
        System.out.println("main方法结束,当前线程:"+Thread.currentThread().getName());
        System.out.println(stringCompletableFuture.get());
    }

}
