package Async;

import java.util.concurrent.Callable;

public class SendTodoThreadCallable implements Callable<Integer> {
    Integer num;
    public SendTodoThreadCallable(Integer num) {
        this.num = num;
    }
    @Override
    public Integer call(){
        System.out.println("线程 " + Thread.currentThread().getName() + " 发送触发Todo通知");
        num++;
        return num;
    }
}
