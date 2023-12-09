package Async;

import java.util.concurrent.*;

public class FutureTestMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("main方法开始,当前线程:"+Thread.currentThread().getName());
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3,
                5,
                3,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(),
                new ThreadPoolExecutor.CallerRunsPolicy());
        Future<Integer> future = threadPoolExecutor.submit(new SendTodoThreadCallable(5));
        System.out.println("main方法结束,当前线程:"+Thread.currentThread().getName());
        Integer num = future.get();
        System.out.println("num:"+num);
    }
}
