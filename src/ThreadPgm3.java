//Use of yield(),stop() and sleep() methods...
class ClassA extends Thread{
    public void run(){
        System.out.println("Start ThreadA...");
        for(int i=1;i<=5;i++){
            if(i==1)
                Thread.yield();
            System.out.println("From threadA:i= "+i);
        }
        System.out.println("...Exit threadA");
    }
}
class ClassB extends Thread{
    public void run(){
        System.out.println("Start ThreadB...");
        for(int j=1;j<=5;j++){
            System.out.println("From thread B:j="+j);
            if(j==2)
                this.stop();
        }
        System.out.println("...Exiting thread B");
    }
}
class ClassC extends Thread{
    public void run(){
        System.out.println("Start threadC....");
        for(int k=1;k<=5;k++){
            System.out.println("From thread C:k="+k);
            if(k==3){
                try{
                    sleep(1000);
                }catch(Exception e){}
            }
        }
        System.out.println("...Exit from thread C");
    }
}
public class ThreadPgm3 {
    public static void main(String[] args) {
        ThreadA t1=new ThreadA();
        ThreadB t2=new ThreadB();
        ThreadC t3=new ThreadC();
        t1.start();
        t2.start();
        t3.start();
    }
}
/*
output:
From thread C with k= 1
From thread B with j= 2
From thread A with i= -1
From thread B with j= 4
From thread C with k= 3
From thread C with k= 5
From thread C with k= 7
From thread B with j= 6
From thread A with i= -2
From thread A with i= -3
From thread B with j= 8
From thread C with k= 9
...Exiting from threadC...
From thread B with j= 10
..Exiting from threadB...
From thread A with i= -4
From thread A with i= -5
...Exiting from threadA...
 */