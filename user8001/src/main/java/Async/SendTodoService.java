package Async;

public class SendTodoService {
    public Integer sendToMessage(String name,Integer num){
        System.out.println(name+"发送触发Todo通知,当前线程:"+ Thread.currentThread().getName());
        return num;
    }
}
