//Creating three thread using the class thread and then running them concurrently...
class ThreadA extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("From thread A with i= "+(-1*i));
        }
        System.out.println("...Exiting from threadA...");
    }
}
class ThreadB extends Thread{
    public void run(){
        for(int j=1;j<=5;j++){
            System.out.println("From thread B with j= "+(2*j));
        }
        System.out.println("..Exiting from threadB...");
    }
}
class ThreadC extends Thread{
    public void run(){
        for(int k=1;k<=5;k++){
            System.out.println("From thread C with k= "+(2*k-1));
        }
        System.out.println("...Exiting from threadC...");
    }
}
public class threadPgm1 {
    public static void main(String[] args) {
        ThreadA a =new ThreadA();
        ThreadB b=new ThreadB();
        ThreadC c=new ThreadC();
        a.start();
        b.start();
        c.start();
        System.out.println("...Multithreading is over...");
    }
}
/*
...Multithreading is over...
From thread C with k= 1
From thread C with k= 3
From thread C with k= 5
From thread C with k= 7
From thread C with k= 9
From thread A with i= -1
From thread A with i= -2
From thread A with i= -3
From thread A with i= -4
From thread A with i= -5
...Exiting from threadA...
From thread B with j= 2
From thread B with j= 4
From thread B with j= 6
From thread B with j= 8
From thread B with j= 10
..Exiting from threadB...
...Exiting from threadC...
 */