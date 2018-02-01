package lenovo;

import java.util.Date;
import java.util.Timer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        Timer timer = new Timer();

        MyTask task = new MyTask();
        Date date  = new Date();

        synchronized (task){
//            timer.schedule(task,5000);
            timer.schedule(task,date,1000);//周期性执行任务，此处执行周期为1s
            task.wait();
//            timer.cancel();开启了新的线程执行定时任务。如果不手动取消定时器。线程不会结束。
        }

    }


}
