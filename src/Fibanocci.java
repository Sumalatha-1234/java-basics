//Simple program to print the fibanocci numbers...
public class Fibanocci {
    static int fib(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return fib(n-1)+fib(n-2);//recursion for fibonacci..
        }
    }

    public static void main(String[] args) {
            int x=10;
            System.out.println("The fibanocci of the given number x is:"+fib(x));
        }
    }

