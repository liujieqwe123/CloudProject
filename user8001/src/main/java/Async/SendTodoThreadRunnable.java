package Async;

public class SendTodoThreadRunnable implements Runnable{
    public SendTodoThreadRunnable() {
    }
    @Override
    public void run() {
        System.out.println("线程 " + Thread.currentThread().getName() + " 发送触发Todo通知");
    }
}
