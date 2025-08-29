//Use of suspend() and resume() methods...
import java.lang.Thread;
class Thread1 extends Thread{
    public void run(){
        try{
            System.out.println("First thread starts running...");
            sleep(1000);
            System.out.println("First thread finishes running..");
        }catch(Exception e){}
    }
}
class Thread2 extends Thread{
    public void run(){
        try{
            System.out.println("second thread starts running");
            System.out.println("second thread is suspended itself");
            System.out.println("Second thread run again..");
        }catch(Exception e){}
    }
}
public class ThreadPgm4 {
    public static void main(String[] args) {
        try{
            Thread1 first=new Thread1();
            //It is a newborn thread i.e. ain newborn state..
            Thread2 second=new Thread2();
            //another new born thread...
            first.start();//first schedules for running..
            second.start();//second is scheduled for running..
            System.out.println("Revive the second thread");//if it is suspended
            System.out.println("Second thread wait for 10 seconds sleep");
            second.sleep(1000);
            System.out.println("Wake up second thread and finish running...");
        }catch(Exception e){}
    }
}
/*
output:
Revive the second thread
Second thread wait for 10 seconds sleep
second thread starts running
second thread is suspended itself
Second thread run again..
First thread starts running...
First thread finishes running..
Wake up second thread and finish running...
 */