//setting the priorities to the threads....
class ClassA extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("From Class A with i= "+(-1*i));
        }
        System.out.println("...Exiting from ClassA...");
    }
}
class ClassB extends Thread{
    public void run(){
        for(int j=1;j<=5;j++){
            System.out.println("From Class B with j= "+(2*j));
        }
        System.out.println("..Exiting from ClassB...");
    }
}
class ClassC extends Thread{
    public void run(){
        for(int k=1;k<=5;k++){
            System.out.println("From Class C with k= "+(2*k-1));
        }
        System.out.println("...Exiting from ClassC...");
    }
}
public class setPriority {
    public static void main(String[] args) {
        ClassA c1 =new ClassA();
        ClassB c2 =new ClassB();
        ClassC c3 =new ClassC();
        c3.setPriority(Thread.MAX_PRIORITY);
        c2.setPriority(c2.getPriority()+1);
        c1.setPriority(Thread.MIN_PRIORITY);
        c1.start();
        c2.start();
        c3.start();
        System.out.println("...Multithreading is over...");
    }
}
/*
output:
...Multithreading is over...
From Class C with k= 1
From Class C with k= 3
From Class B with j= 2
From Class B with j= 4
From Class B with j= 6
From Class B with j= 8
From Class B with j= 10
From Class A with i= -1
..Exiting from ClassB...
From Class C with k= 5
From Class C with k= 7
From Class C with k= 9
...Exiting from ClassC...
From Class A with i= -2
From Class A with i= -3
From Class A with i= -4
From Class A with i= -5
...Exiting from ClassA...

 */