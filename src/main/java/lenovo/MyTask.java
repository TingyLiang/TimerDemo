package lenovo;

import java.util.TimerTask;

public class MyTask extends TimerTask{
    public void run() {
        System.out.println("开始干活");
        synchronized (this){
            this.notify();// notify和wait方法只能在同步方法或同步块中使用
        }

    }
}
